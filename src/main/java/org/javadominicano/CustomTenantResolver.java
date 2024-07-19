package org.javadominicano;

import io.quarkus.arc.Unremovable;
import io.quarkus.hibernate.orm.PersistenceUnitExtension;
import io.quarkus.hibernate.orm.runtime.tenant.TenantResolver;
import io.vertx.ext.web.RoutingContext;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
@Unremovable
@PersistenceUnitExtension
public class CustomTenantResolver implements TenantResolver {

    @Inject
    RoutingContext routingContext;

    public static final String QUERY_NAME = "tenantId";
    public static final String DEFAULT = "public";

    @Override
    public String getDefaultTenantId() {
        return DEFAULT;
    }

    @Override
    public String resolveTenantId() {
        String tenantId = routingContext.request().params().get(QUERY_NAME);
        if (tenantId != null && !tenantId.isEmpty()) return tenantId;

        return this.getDefaultTenantId();
    }
    
    
}
