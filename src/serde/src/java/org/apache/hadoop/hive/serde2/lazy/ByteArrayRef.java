/*!
* Copyright 2010 - 2013 Pentaho Corporation.  All rights reserved.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*
*/

package org.apache.hadoop.hive.serde2.lazy;

/**
 * ByteArrayRef stores a reference to a byte array.
 * 
 * The LazyObject hierarchy uses a reference to a single ByteArrayRef, so that
 * it's much faster to switch to the next row and release the reference to the
 * old row (so that the system can do garbage collection if needed).
 */
public class ByteArrayRef {

  /**
   * Stores the actual data.
   */
  byte[] data;

  public byte[] getData() {
    return data;
  }

  public void setData(byte[] data) {
    this.data = data;
  }

}
