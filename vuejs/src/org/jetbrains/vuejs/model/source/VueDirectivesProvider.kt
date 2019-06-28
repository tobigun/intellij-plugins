// Copyright 2000-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package org.jetbrains.vuejs.model.source

import com.intellij.lang.javascript.psi.JSProperty
import com.intellij.psi.search.GlobalSearchScope
import org.jetbrains.vuejs.codeInsight.refs.getContainingXmlFile

class VueDirectivesProvider {
  companion object {

    fun createContainingFileScope(directives: JSProperty?): GlobalSearchScope? {
      directives ?: return null
      val file = getContainingXmlFile(directives) ?: return null
      return GlobalSearchScope.fileScope(file.originalFile)
    }

  }
}
