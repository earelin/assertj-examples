package org.assertj.examples.data;

import org.assertj.core.util.Objects;

/**
 * Abstract base class for {@link Employee} specific assertions - Generated by CustomAssertionGenerator.
 */
public abstract class AbstractEmployeeAssert<S extends AbstractEmployeeAssert<S, A>, A extends Employee> extends AbstractPersonAssert<S, A> {

  /**
   * Creates a new <code>{@link AbstractEmployeeAssert}</code> to make assertions on actual Employee.
   * @param actual the Employee we want to make assertions on.
   */
  protected AbstractEmployeeAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  /**
   * Verifies that the actual Employee's company is equal to the given one.
   * @param company the given company to compare the actual Employee's company to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Employee's company is not equal to the given one.
   */
  public S hasCompany(String company) {
    // check that actual Employee we want to make assertions on is not null.
    isNotNull();


    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting company of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // check
    String actualCompany = actual.getCompany();
    if (!Objects.areEqual(actualCompany, company)) {
      failWithMessage(assertjErrorMessage, actual, company, actualCompany);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual Employee's rank is equal to the given one.
   * @param rank the given rank to compare the actual Employee's rank to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Employee's rank is not equal to the given one.
   */
  public S hasRank(String rank) {
    // check that actual Employee we want to make assertions on is not null.
    isNotNull();


    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting rank of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // check
    String actualRank = actual.rank;
    if (!Objects.areEqual(actualRank, rank)) {
      failWithMessage(assertjErrorMessage, actual, rank, actualRank);
    }

    // return the current assertion for method chaining
    return myself;
  }

}
