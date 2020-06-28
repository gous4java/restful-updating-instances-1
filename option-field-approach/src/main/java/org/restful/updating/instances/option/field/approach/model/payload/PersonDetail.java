/**
 * Copyright 2020 the project restful-updating-instances authors
 * and the original author or authors annotated by {@author}
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.restful.updating.instances.option.field.approach.model.payload;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.NotNull;
import java.util.Optional;

/**
 * @project restful-updating-instances
 * @created 24.05.2020 10:52
 * <p>
 * @author Alexander A. Kropotin
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString(
        of = {
                "uid",
                "firstName",
                "lastName",
                "age"
        }
)
@EqualsAndHashCode(
        of = {
                "uid"
        },
        doNotUseGetters = true
)
@Getter
@FieldDefaults(
        level = AccessLevel.PRIVATE
)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PersonDetail {

    @JsonProperty("uid")
    Optional<@NotNull Long> uid;

    @JsonProperty("first_name")
    Optional<@NotNull String> firstName;

    @JsonProperty("last_name")
    Optional<@NotNull String> lastName;

    @JsonProperty("age")
    Optional<@NotNull Integer> age;

    public void setUid(Long uid) {
        this.uid = Optional.ofNullable(uid);
    }

    public void setFirstName(String firstName) {
        this.firstName = Optional.ofNullable(firstName);
    }

    public void setLastName(String lastName) {
        this.lastName = Optional.ofNullable(lastName);
    }

    public void setAge(Integer age) {
        this.age = Optional.ofNullable(age);
    }
}