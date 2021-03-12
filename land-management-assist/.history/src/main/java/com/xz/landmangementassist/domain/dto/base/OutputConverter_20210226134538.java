package com.xz.landmanagementassist.domain.dto.base;

import org.springframework.lang.NonNull;

import static com.xz.landmanagementassist.utils.MyBeanUtil.updateProperties;

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

    // TODO: xuzhu:此接口无用，最后考虑删除

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
}
