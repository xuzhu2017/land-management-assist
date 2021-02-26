package com.xz.landmangementassist.domain.dto.base;

import org.springframework.lang.NonNull;

import static com.xz.landmangementassist.utils.BeanUtil.updateProperties;

public interface DTOEntityConverter<DTO, Entity> {
    @NonNull
    default DTO convertFrom(@NonNull Entity domain) {

        updateProperties(domain, this);

        return (DTO) this;
    }
}
