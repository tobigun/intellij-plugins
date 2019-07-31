/*
 * Copyright (c) 2015, the Dart project authors.
 *
 * Licensed under the Eclipse Public License v1.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package org.dartlang.vm.service.element;

// This is a generated file.

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

/**
 * See getInstances.
 */
@SuppressWarnings({"WeakerAccess", "unused"})
public class InstanceSet extends Response {

  public InstanceSet(JsonObject json) {
    super(json);
  }

  /**
   * An array of instances of the requested type.
   */
  public ElementList<ObjRef> getInstances() {
    return new ElementList<ObjRef>(json.get("instances").getAsJsonArray()) {
      @Override
      protected ObjRef basicGet(JsonArray array, int index) {
        return new ObjRef(array.get(index).getAsJsonObject());
      }
    };
  }

  /**
   * The number of instances of the requested type currently allocated.
   */
  public int getTotalCount() {
    return json.get("totalCount") == null ? -1 : json.get("totalCount").getAsInt();
  }
}