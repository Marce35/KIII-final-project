package mk.ukim.finki.wp.kol2022.g2.model;

import org.springframework.security.core.GrantedAuthority;

public enum StudentType implements GrantedAuthority {
    ROLE_ADMIN,
    UNDERGRADUATE,
    MASTER;

    @Override
    public String getAuthority() {
        return name();
    }
}
