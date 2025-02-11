/*
 * Copyright 2014 - Present Rafael Winterhalter
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.bytebuddy.build.gradle.api;

import java.lang.annotation.*;

/**
 * A placeholder representation of Gradle's {@code org.gradle.api.tasks.PathSensitive} type.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD})
@GradleType("org.gradle.api.tasks.PathSensitive")
public @interface PathSensitive {

    /**
     * A placeholder representation of Gradle's {@code org.gradle.api.tasks.PathSensitive#value} method.
     *
     * @return The method's return value.
     */
    PathSensitivity value();
}
