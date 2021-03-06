// Copyright 2000-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package org.jetbrains.vuejs.model.source

import com.intellij.lang.javascript.psi.JSObjectLiteralExpression
import com.intellij.lang.javascript.psi.stubs.JSImplicitElement
import com.intellij.openapi.project.Project

interface VueAdvancedComponentDetailsProvider {
  fun getIndexedData(descriptor: JSObjectLiteralExpression?, project: Project): Collection<JSImplicitElement>
  fun getDescriptorFinder(): (JSImplicitElement) -> JSObjectLiteralExpression?
}
