# GraphQL Data Fetcher demo


The custom datafetcher in defined in [GraphQLConfig.kt](src/main/kotlin/org/kylej/gqldatafetcher/GraphQLConfig.kt) is used when we query in the SearchController.

In the [SearchControllerIT](src/test/kotlin/org/kylej/gqldatafetcher/SearchControllerIT.kt) we have a test that uses the custom datafetcher to fetch data from the GraphQL API. 

in one test, it fetches all the fields from the PostRespository, and in the other, it only requests the 'title' field since that's all that's requested

Let's look at the hibernate logs from each test to show how it works:


Test 1: All fields requested, and queried:

```
Hibernate: insert into post (content,title,id) values (?,?,?)
Hibernate: select p1_0.id,p1_0.title,p1_0.content from post p1_0
```

Test 2: Only title requested, and queried:

```
Hibernate: insert into post (content,title,id) values (?,?,?)
Hibernate: select p1_0.title from post p1_0
```