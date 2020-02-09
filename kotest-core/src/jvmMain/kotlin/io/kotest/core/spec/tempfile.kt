package io.kotest.core.spec

import java.io.File
import java.nio.file.Files

fun TestConfiguration.tempfile(prefix: String? = null, suffix: String? = ".tmp"): File {
   val file = Files.createTempFile(prefix, suffix).toFile()
   afterSpec {
      file.delete()
   }
   return file
}