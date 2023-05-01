package com.vpdev.http.dto;

import lombok.Value;

//@AllArgsConstructor
//@Getter
//@EqualsAndHashCode
//@ToString
@Value
public final class FlightDto {

    private final Long id;
    private final String description;

    FlightDto(Long id, String description) {
        this.id = id;
        this.description = description;
    }

    public static FlightDtoBuilder builder() {
        return new FlightDtoBuilder();
    }

    public static class FlightDtoBuilder {
        private Long id;
        private String description;

        FlightDtoBuilder() {
        }

        public FlightDtoBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public FlightDtoBuilder description(String description) {
            this.description = description;
            return this;
        }

        public FlightDto build() {
            return new FlightDto(id, description);
        }

        public String toString() {
            return "FlightDto.FlightDtoBuilder(id=" + this.id + ", description=" + this.description + ")";
        }
    }
}
