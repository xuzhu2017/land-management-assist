package com.xz.landmanagementassist.domain.dto.base;

import org.springframework.lang.NonNull;

import static com.xz.landmanagementassist.utils.BeanUtil.updateProperties;

/**
 * Converter interface for output DTO.
 *
 * <b>The implementation type must be equal to DTO type</b>
 *
 * @param <DTO>    the implementation class type
 * @param <DOMAIN> domain type
 * @author johnniang
 */
public interface OutputConverter<DTO extends OutputConverter<DTO, DOMAIN>, DOMAIN> {

    /**
     * Convert from domain.(shallow)
     *
     * @param domain domain data
     * @return converted dto data
     */
    @SuppressWarnings("unchecked")
    @NonNull
    default <T extends DTO> T convertFrom(@NonNull DOMAIN domain) {

        updateProperties(domain, this);

        return (T) this;
    }

    // TODO: xuzhu:写一个从dto创建实体的方法
    default <DOMAIN> DOMAIN createEntity(Class<DOMAIN> domain)
            throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        DOMAIN entity = domain.getDeclaredConstructor(domain).newInstance(new Object());
        updateProperties(this, entity);
        return entity;
    }
}
