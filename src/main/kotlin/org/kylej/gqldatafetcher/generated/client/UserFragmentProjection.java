package org.kylej.gqldatafetcher.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class UserFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public UserFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("User"));
  }

  public UserFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public UserFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public UserFragmentProjection<PARENT, ROOT> username() {
    getFields().put("username", null);
    return this;
  }

  public UserFragmentProjection<PARENT, ROOT> email() {
    getFields().put("email", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on User {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
