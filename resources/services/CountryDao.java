package org.apache.wicket.training.cheesr.services;

import java.util.List;

import org.apache.wicket.training.cheesr.domain.Country;

public interface CountryDao {

	public List<Country> getCountries();
}