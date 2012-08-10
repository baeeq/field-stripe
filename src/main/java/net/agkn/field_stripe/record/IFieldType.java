package net.agkn.field_stripe.record;

/*
 * Copyright 2012 Aggregate Knowledge, Inc.
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

/**
 * The type of a field. 
 *
 * @author rgrzywinski
 */
public interface IFieldType {
    // CHECK:  does this need a #getName()?

    /**
     * @return <code>true</code> if and only if this type is a composite (or
     *         node) type. <code>false</code> if this type is a primitive (or
     *         leaf) type. This is provided purely for convenience.
     */
    boolean isComposite();
}