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

import android.util.Log

fun log(tag: String, message: String) {
  Log.d(tag, message)
}

fun log(tag: String, e: Throwable) {
  if (e.message != null) {
    Log.e(tag, e.message!!)
  }
  e.printStackTrace()
}