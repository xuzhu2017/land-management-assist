package com.xz.landmanagementassist.domain.dto.base;

import org.springframework.lang.NonNull;

public interface DTOEntityConverter<DTO, Entity> {
    @NonNull
    default DTO convertFrom(@NonNull Entity domain) {

        updateProperties(domain, this);

        return (T) this;
    }
}
