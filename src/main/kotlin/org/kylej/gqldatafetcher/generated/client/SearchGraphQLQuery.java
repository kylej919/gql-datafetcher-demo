package org.kylej.gqldatafetcher.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import jakarta.annotation.Generated;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

@Generated("com.netflix.graphql.dgs.codegen.CodeGen")
@org.kylej.gqldatafetcher.generated.Generated
public class SearchGraphQLQuery extends GraphQLQuery {
  public SearchGraphQLQuery(String queryName) {
    super("query", queryName);
  }

  public SearchGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "search";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  @Generated("com.netflix.graphql.dgs.codegen.CodeGen")
  @org.kylej.gqldatafetcher.generated.Generated
  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String queryName;

    public SearchGraphQLQuery build() {
      return new SearchGraphQLQuery(queryName);                                     
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
