package com.xz.landmanagementassist.domain.dto.base;

public interface DTOEntityConverter<DTO, Entity> {
    @NonNull
    default DTO convertFrom(@NonNull DOMAIN domain) {

        updateProperties(domain, this);

        return (T) this;
    }
}
