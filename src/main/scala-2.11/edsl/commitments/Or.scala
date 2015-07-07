/*
Copyright 2015 David R. Pugh, Dan F. Tang, J. Doyne Farmer

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package edsl.commitments


/** Choose which of two edsl to acquire.
  *
  * @param first A `Commitment` object.
  * @param second Another `Commitment` object.
  * @note If you acquire `Or(first, second)`, then you immediately acquire
  *       either the `first` contract (unless it has expired) or the `second`
  *       contract (unless it has expired). You can not acquire both `first`
  *       and `second` edsl. The contract `Or(first, second)` expires
  *       only after both `first` and `second` edsl have expired.
  */
case class Or(first: Commitment, second: Commitment) extends Commitment

