// Copyright 2020 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package app.evergreen.services

import java.io.BufferedReader
import java.io.InputStreamReader

/** Reads system properties by name. */
class SystemProp {
  fun read(propName: String): String {
    val process = ProcessBuilder().command(GETPROP_EXECUTABLE_PATH, propName).redirectErrorStream(true).start()
    BufferedReader(InputStreamReader(process.inputStream)).use {
      return it.readLine() ?: ""
    }
  }

  companion object {
    private const val GETPROP_EXECUTABLE_PATH = "/system/bin/getprop"
  }
}
