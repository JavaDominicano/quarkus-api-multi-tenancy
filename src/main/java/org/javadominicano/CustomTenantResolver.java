package org.javadominicano;

import io.quarkus.arc.Unremovable;
import io.quarkus.hibernate.orm.runtime.tenant.TenantResolver;
import jakarta.enterprise.context.RequestScoped;

@RequestScoped
@Unremovable
public class CustomTenantResolver implements TenantResolver {

    public final static String DEFAULT = "public";

    @Override
    public String getDefaultTenantId() {
        return DEFAULT;
    }

    @Override
    public String resolveTenantId() {
        return this.getDefaultTenantId();
    }
    
    
}
