/*
 * Copyright 2002-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package sample.ui.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "party")
public class Party extends BaseEntity {

	private static final long serialVersionUID = -4229983676963278055L;

	@Column(name = "party_name")
   @NotEmpty
   protected String PartyName;

   @Column(name = "city_name")
   @NotEmpty
   protected String cityName;
   
   @OneToMany(cascade = CascadeType.ALL, mappedBy = "party")
   private Set<Contact> contacts;

	public Set<Contact> getContacts()
	{
		return contacts;
	}

	public String getPartyName()
	{
		return PartyName;
	}

	public void setPartyName(String partyName)
	{
		PartyName = partyName;
	}

	public String getCityName()
	{
		return cityName;
	}

	public void setCityName(String cityName)
	{
		this.cityName = cityName;
	}



}
