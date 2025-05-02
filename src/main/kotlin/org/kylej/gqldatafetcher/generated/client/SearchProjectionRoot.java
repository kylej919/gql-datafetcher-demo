package org.kylej.gqldatafetcher.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import jakarta.annotation.Generated;

@Generated("com.netflix.graphql.dgs.codegen.CodeGen")
@org.kylej.gqldatafetcher.generated.Generated
public class SearchProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SearchProjectionRoot() {
    super(null, null, java.util.Optional.of("SearchResult"));
  }

  public SearchProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PostFragmentProjection<SearchProjectionRoot<PARENT, ROOT>, SearchProjectionRoot<PARENT, ROOT>> onPost(
      ) {
    PostFragmentProjection<SearchProjectionRoot<PARENT, ROOT>, SearchProjectionRoot<PARENT, ROOT>> fragment = new PostFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public CommentFragmentProjection<SearchProjectionRoot<PARENT, ROOT>, SearchProjectionRoot<PARENT, ROOT>> onComment(
      ) {
    CommentFragmentProjection<SearchProjectionRoot<PARENT, ROOT>, SearchProjectionRoot<PARENT, ROOT>> fragment = new CommentFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public UserFragmentProjection<SearchProjectionRoot<PARENT, ROOT>, SearchProjectionRoot<PARENT, ROOT>> onUser(
      ) {
    UserFragmentProjection<SearchProjectionRoot<PARENT, ROOT>, SearchProjectionRoot<PARENT, ROOT>> fragment = new UserFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }
}
