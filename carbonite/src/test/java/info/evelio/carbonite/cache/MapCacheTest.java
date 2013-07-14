/*
 * Copyright 2013 Evelio Tarazona Cáceres <evelio@evelio.info>
 * Copyright 2013 Carbonite contributors <contributors@evelio.info>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package info.evelio.carbonite.cache;

import org.junit.Assert;
import org.junit.Test;

public abstract class MapCacheTest {
  @Test
  public void testSetIsRetained() {
    MapCache<String, String> cache = gimmeCacheOfOne();
    cache.set("key", "value");

    Assert.assertEquals("value", cache.get("key"));
    Assert.assertNotEquals("different", cache.get("key"));
  }

  @Test public void testNullNoOp() {
    gimmeCacheOfOne().set("key", null);
  }

  protected abstract MapCache<String, String> gimmeCacheOfOne();
}
