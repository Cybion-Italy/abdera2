/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  The ASF licenses this file to You
 * under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.  For additional information regarding
 * copyright in this work, please see the NOTICE file in the top level
 * directory of this distribution.
 */
package org.apache.abdera2.activities.model.objects;

import java.util.Map;

import org.apache.abdera2.activities.model.ASObject;
import org.apache.abdera2.common.anno.Name;


public class ServiceObject 
  extends ASObject {

  
  public static Builder makeService() {
    return new Builder("service");
  }
  
  @Name("service")
  public final static class Builder 
    extends ASObject.Builder<ServiceObject,Builder> {
    public Builder() {
      super(ServiceObject.class,Builder.class);
    }
    public Builder(String objectType) {
      super(objectType,ServiceObject.class,Builder.class);
    }
    public Builder(Map<String,Object> map) {
      super(map,ServiceObject.class,Builder.class);
    }
  }
  
  public ServiceObject(Map<String,Object> map) {
    super(map,Builder.class,ServiceObject.class);
  }
  
  public <X extends ServiceObject, M extends ASObject.Builder<X,M>>ServiceObject(Map<String,Object> map, Class<M> _class, Class<X> _obj) {
    super(map,_class,_obj);
  }

}
