// Copyright 2010, University of Twente, Formal Methods and Tools group
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package spinja.exceptions;

/**
 * The ValidationException is thrown in runtime when an error was found in the Model.
 * 
 * @author Marc de Jonge
 * @version 1.0
 */
public class ValidationException extends SpinJaException {
	private static final long serialVersionUID = 4850442035327685039L;

	/**
	 * Creates a new DeadlockException using a specified message.
	 * 
	 * @param msg
	 *            The message that is to be shown.
	 */
	public ValidationException(final String msg) {
		super(msg);
	}
}
