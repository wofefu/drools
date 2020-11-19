/*
 * Copyright 2020 Red Hat, Inc. and/or its affiliates.
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
package org.kie.pmml.api.models;

import org.kie.pmml.api.enums.DATA_TYPE;
import org.kie.pmml.api.enums.OP_TYPE;
import org.kie.pmml.api.enums.RESULT_FEATURE;

/**
 * User-friendly representation of an <b>OutputField</b>
 */
public class OutputField {

    private final String name;
    private final OP_TYPE opType;
    private final DATA_TYPE dataType;
    private final String targetField;
    private final RESULT_FEATURE resultFeature;

    public OutputField(final String name,
                       final OP_TYPE opType,
                       final DATA_TYPE dataType,
                       final String targetField,
                       final RESULT_FEATURE resultFeature) {
        this.name = name;
        this.opType = opType;
        this.dataType = dataType;
        this.targetField = targetField;
        this.resultFeature = resultFeature;
    }

    public String getName() {
        return name;
    }

    public OP_TYPE getOpType() {
        return opType;
    }

    public DATA_TYPE getDataType() {
        return dataType;
    }

    public String getTargetField() {
        return targetField;
    }

    public RESULT_FEATURE getResultFeature() {
        return resultFeature;
    }
}