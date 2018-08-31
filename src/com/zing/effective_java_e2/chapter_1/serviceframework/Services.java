package com.zing.effective_java_e2.chapter_1.serviceframework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Noninstantiable class for service registration and access
 */
public class Services {
    private Services() {
    }

    // Maps service names to services
    private static final Map<String, Provider> providers =
            new ConcurrentHashMap<>();
    public static final String DEFAULT_PROVIDER_NAME = "<def>";

    // Provider registration API
    public static void registerDefaultProvider(Provider p) {
        registerProvider(DEFAULT_PROVIDER_NAME, p);
    }

    public static void registerProvider(String name, Provider p) {
        providers.put(name, p);
    }

    // Service access API
    public static Service newInstance() {
        return newInstance(DEFAULT_PROVIDER_NAME);
    }

    private static Service newInstance(String name) {
        Provider p = providers.get(name);
        if (p == null) {
            throw new IllegalArgumentException("No provider register with name: " + name);
        }
        return p.newService();
    }
}
