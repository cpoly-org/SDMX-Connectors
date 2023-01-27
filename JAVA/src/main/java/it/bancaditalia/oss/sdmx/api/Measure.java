/* Copyright 2010,2014 Bank Of Italy
*
* Licensed under the EUPL, Version 1.1 or - as soon they
* will be approved by the European Commission - subsequent
* versions of the EUPL (the "Licence");
* You may not use this work except in compliance with the
* Licence.
* You may obtain a copy of the Licence at:
*
*
* http://ec.europa.eu/idabc/eupl
*
* Unless required by applicable law or agreed to in
* writing, software distributed under the Licence is
* distributed on an "AS IS" basis,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
* express or implied.
* See the Licence for the specific language governing
* permissions and limitations under the Licence.
*/
package it.bancaditalia.oss.sdmx.api;

public class Measure extends SdmxMetaElement
{
	private int position;

	/**
	 * Creates an empty dimension.
	 */
	public Measure(String id, int position)
	{
		super(id);
		this.position = position;
	}

	/**
	 * @return The dimension ordinality in the dataflow structure.
	 */
	public int getPosition()
	{
		return position;
	}

	@Override
	public String toString()
	{
		return String.format("Measure [id=%s, position=%d, codelist=%s]\n", getId(), position);
	}
	
	@Override
	public Codelist getCodeList()
	{
		throw new UnsupportedOperationException("No codelists for Measures.");
	}
}
