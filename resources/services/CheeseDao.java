package nl.topicus.cheesr.services;

import java.util.List;

import nl.topicus.cheesr.domain.Cheese;

public interface CheeseDao {
	public List<Cheese> getCheeses();
}
