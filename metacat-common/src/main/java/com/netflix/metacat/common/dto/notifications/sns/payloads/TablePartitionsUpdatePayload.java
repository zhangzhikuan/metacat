/*
 *
 *  Copyright 2016 Netflix, Inc.
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 *
 */
package com.netflix.metacat.common.dto.notifications.sns.payloads;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

/**
 * Information about how the partitions have changed when a table was updated.
 *
 * @author tgianos
 * @since 0.1.47
 */
@Getter
@ToString
public class TablePartitionsUpdatePayload {
    private final int numCreatedPartitions;
    private final int numDeletedPartitions;

    /**
     * Constructor.
     *
     * @param numCreatedPartitions The number of partitions that were created for the table
     * @param numDeletedPartitions The number of partitions that were deleted from the table
     */
    @JsonCreator
    public TablePartitionsUpdatePayload(
        @JsonProperty("numCreatedPartitions") final int numCreatedPartitions,
        @JsonProperty("numDeletedPartitions") final int numDeletedPartitions
    ) {
        this.numCreatedPartitions = numCreatedPartitions;
        this.numDeletedPartitions = numDeletedPartitions;
    }
}