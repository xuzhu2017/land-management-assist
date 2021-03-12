package com.xz.landmanagementassist.domain.dto.base;

import org.springframework.lang.NonNull;

import static com.xz.landmanagementassist.utils.BeanUtil.updateProperties;

public interface DTOEntityConverter<DTO, Entity> {
    @NonNull
    default DTO convertFrom(@NonNull Entity domain) {

        updateProperties(domain, this);

        return this;
    }
}
