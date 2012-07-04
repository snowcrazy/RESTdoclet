/*
 * #%L
 * restdoc-doclet
 * %%
 * Copyright (C) 2012 IG Group
 * %%
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
 * #L%
 */
package com.iggroup.oss.restdoclet.doclet.type;

/**
 * This class creates a response-parameter.
 */
public class ResponseParameter extends AbstractDocType {

   /**
    * No-argument constructor for this class to be used as a bean or by JiBX
    * binding.
    */
   public ResponseParameter() {
      super();
   }

   /**
    * Constructs this parameter with its name and its documentation.
    * 
    * @param name the parameter's name.
    * @param type type info
    * @param javadoc the parameter's documentation.
    */
   public ResponseParameter(final String name, final String type,
      final String javadoc) {
      super(name, name, javadoc);
      assertValid();
   }

}
