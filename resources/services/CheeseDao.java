package org.apache.wicket.training.cheesr.services;

import java.util.List;

import org.apache.wicket.training.cheesr.domain.Cheese;

public interface CheeseDao {
	public List<Cheese> getCheeses();
}
