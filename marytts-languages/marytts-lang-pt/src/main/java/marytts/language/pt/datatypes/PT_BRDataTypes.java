/**
 * Copyright 2000-2008 DFKI GmbH.
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
package marytts.language.pt.datatypes;

import marytts.datatypes.MaryDataType;
import marytts.datatypes.MaryXML;

/**
 * This class will register the data types that are specific for the PT BR synthesis modules.
 * 
 * @author Judilson Costa
 * 
 */
public class PT_BRDataTypes {
	public static final MaryDataType PAUSES_PT = new MaryDataType("PAUSES_PT", true, true, MaryDataType.MARYXML, MaryXML.MARYXML);
	public static final MaryDataType PHRASES_PT = new MaryDataType("PHRASES_PT", true, true, MaryDataType.MARYXML,
			MaryXML.MARYXML);
}
