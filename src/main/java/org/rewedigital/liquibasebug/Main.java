package org.rewedigital.liquibasebug;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(final String[] args) {
        final ObjectMapper mapper = new ObjectMapper().findAndRegisterModules();
        System.out.println(mapper.getRegisteredModuleIds());
    }
}
