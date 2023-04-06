/**
 * Copyright 2000-2006 DFKI GmbH.
 * All Rights Reserved.  Use is subject to license terms.
 *
 * This file is part of MARY TTS.
 *
 * MARY TTS is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, version 3 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package marytts.language.pt.prosody;

/**
 * Information on how to recognize and how to realize different sentence types.
 */
public class SentenceType {
	public static final SentenceType declarative = new SentenceType("declarative", "(?<=^|\\s)[Nn]ão\\s"); // Define a sentença declarativa
	public static final SentenceType exclamatory = new SentenceType("exclamatory", "(!+|(?<=^|\\s)[Qq]ue\\s[\\wÀ-úçÇ]+!+|[!?.]+(?=[\"')\\]]*(\\s|$)))"); // Define a sentença exclamativa
	public static final SentenceType imperative = new SentenceType("imperative", "(?<=^|\\s)([Vv]á\\s[AaááÀ-úçÇ]+|[Ff]aça\\s[\\wÀ-úçÇ]+|[Cc]omece\\s[\\wÀ-úçÇ]+)"); // Define a sentença imperativa
	public static final SentenceType interrogative = new SentenceType("interrogative", "(?<=^|\\s)(([Qq]uem|[Oo]nde|[Cc]omo|[Pp]or que|[Qq]uando|[Qq]uanto|[Qq]ue)\\s+[\\wÀ-úçÇ]+[?!.]*)"); // Define a sentença interrogativa

	public static SentenceType punctuationType(String punct) {
		if (punct.equals("."))
			return declarative;
		else if (punct.equals("?"))
			return interrogative;
		else if (punct.equals("!"))
			return exclamatory;
		else
			return null;
	}

	private String name;
	private String sentenceFinalBoundary;

	private SentenceType(String name, String sentenceFinalBoundary) {
		this.name = name;
		this.sentenceFinalBoundary = sentenceFinalBoundary;
	}

	public String name() {
		return name;
	}

	public String toString() {
		return name();
	}

}
