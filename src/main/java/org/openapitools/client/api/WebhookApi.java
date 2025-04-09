/**
 * API2Cart OpenAPI
 * API2Cart
 *
 * The version of the OpenAPI document: 1.1
 * Contact: contact@api2cart.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.api;

import org.openapitools.client.ApiInvoker;
import org.openapitools.client.ApiException;
import org.openapitools.client.Pair;

import org.openapitools.client.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import org.openapitools.client.model.AttributeDelete200Response;
import org.openapitools.client.model.BasketLiveShippingServiceCreate200Response;
import org.openapitools.client.model.ProductImageUpdate200Response;
import org.openapitools.client.model.WebhookCount200Response;
import org.openapitools.client.model.WebhookEvents200Response;
import org.openapitools.client.model.WebhookList200Response;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class WebhookApi {
  String basePath = "https://api.api2cart.com/v1.1";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  /**
  * webhook.count
  * Count registered webhooks on the store.
   * @param entity The entity you want to filter webhooks by (e.g. order or product)
   * @param action The action you want to filter webhooks by (e.g. order or product)
   * @param active The webhook status you want to filter webhooks by
   * @return WebhookCount200Response
  */
  public WebhookCount200Response webhookCount (String entity, String action, Boolean active) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;

    // create path and map variables
    String path = "/webhook.count.json";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "entity", entity));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "action", action));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "active", active));
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "StoreKeyAuth", "ApiKeyAuth" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (WebhookCount200Response) ApiInvoker.deserialize(localVarResponse, "", WebhookCount200Response.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * webhook.count
   * Count registered webhooks on the store.
   * @param entity The entity you want to filter webhooks by (e.g. order or product)   * @param action The action you want to filter webhooks by (e.g. order or product)   * @param active The webhook status you want to filter webhooks by
  */
  public void webhookCount (String entity, String action, Boolean active, final Response.Listener<WebhookCount200Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;


    // create path and map variables
    String path = "/webhook.count.json".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "entity", entity));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "action", action));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "active", active));


    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] { "StoreKeyAuth", "ApiKeyAuth" };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((WebhookCount200Response) ApiInvoker.deserialize(localVarResponse,  "", WebhookCount200Response.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * webhook.create
  * Create webhook on the store and subscribe to it.
   * @param entity Specify the entity that you want to enable webhooks for (e.g product, order, customer, category)
   * @param action Specify what action (event) will trigger the webhook (e.g add, delete, or update)
   * @param callback Callback url that returns shipping rates. It should be able to accept POST requests with json data.
   * @param label The name you give to the webhook
   * @param fields Fields the webhook should send
   * @param active Webhook status
   * @param storeId Defines store id where the webhook should be assigned
   * @return BasketLiveShippingServiceCreate200Response
  */
  public BasketLiveShippingServiceCreate200Response webhookCreate (String entity, String action, String callback, String label, String fields, Boolean active, String storeId) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'entity' is set
    if (entity == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'entity' when calling webhookCreate",
        new ApiException(400, "Missing the required parameter 'entity' when calling webhookCreate"));
    }
    // verify the required parameter 'action' is set
    if (action == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'action' when calling webhookCreate",
        new ApiException(400, "Missing the required parameter 'action' when calling webhookCreate"));
    }

    // create path and map variables
    String path = "/webhook.create.json";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "entity", entity));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "action", action));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "callback", callback));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "label", label));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "fields", fields));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "active", active));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "store_id", storeId));
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "StoreKeyAuth", "ApiKeyAuth" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (BasketLiveShippingServiceCreate200Response) ApiInvoker.deserialize(localVarResponse, "", BasketLiveShippingServiceCreate200Response.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * webhook.create
   * Create webhook on the store and subscribe to it.
   * @param entity Specify the entity that you want to enable webhooks for (e.g product, order, customer, category)   * @param action Specify what action (event) will trigger the webhook (e.g add, delete, or update)   * @param callback Callback url that returns shipping rates. It should be able to accept POST requests with json data.   * @param label The name you give to the webhook   * @param fields Fields the webhook should send   * @param active Webhook status   * @param storeId Defines store id where the webhook should be assigned
  */
  public void webhookCreate (String entity, String action, String callback, String label, String fields, Boolean active, String storeId, final Response.Listener<BasketLiveShippingServiceCreate200Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'entity' is set
    if (entity == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'entity' when calling webhookCreate",
        new ApiException(400, "Missing the required parameter 'entity' when calling webhookCreate"));
    }
    // verify the required parameter 'action' is set
    if (action == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'action' when calling webhookCreate",
        new ApiException(400, "Missing the required parameter 'action' when calling webhookCreate"));
    }

    // create path and map variables
    String path = "/webhook.create.json".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "entity", entity));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "action", action));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "callback", callback));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "label", label));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "fields", fields));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "active", active));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "store_id", storeId));


    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] { "StoreKeyAuth", "ApiKeyAuth" };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((BasketLiveShippingServiceCreate200Response) ApiInvoker.deserialize(localVarResponse,  "", BasketLiveShippingServiceCreate200Response.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * webhook.delete
  * Delete registered webhook on the store.
   * @param id Webhook id
   * @return AttributeDelete200Response
  */
  public AttributeDelete200Response webhookDelete (String id) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'id' when calling webhookDelete",
        new ApiException(400, "Missing the required parameter 'id' when calling webhookDelete"));
    }

    // create path and map variables
    String path = "/webhook.delete.json";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "id", id));
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "StoreKeyAuth", "ApiKeyAuth" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (AttributeDelete200Response) ApiInvoker.deserialize(localVarResponse, "", AttributeDelete200Response.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * webhook.delete
   * Delete registered webhook on the store.
   * @param id Webhook id
  */
  public void webhookDelete (String id, final Response.Listener<AttributeDelete200Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'id' when calling webhookDelete",
        new ApiException(400, "Missing the required parameter 'id' when calling webhookDelete"));
    }

    // create path and map variables
    String path = "/webhook.delete.json".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "id", id));


    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] { "StoreKeyAuth", "ApiKeyAuth" };

    try {
      apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((AttributeDelete200Response) ApiInvoker.deserialize(localVarResponse,  "", AttributeDelete200Response.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * webhook.events
  * List all Webhooks that are available on this store.
   * @return WebhookEvents200Response
  */
  public WebhookEvents200Response webhookEvents () throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;

    // create path and map variables
    String path = "/webhook.events.json";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "StoreKeyAuth", "ApiKeyAuth" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (WebhookEvents200Response) ApiInvoker.deserialize(localVarResponse, "", WebhookEvents200Response.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * webhook.events
   * List all Webhooks that are available on this store.

  */
  public void webhookEvents (final Response.Listener<WebhookEvents200Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;


    // create path and map variables
    String path = "/webhook.events.json".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] { "StoreKeyAuth", "ApiKeyAuth" };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((WebhookEvents200Response) ApiInvoker.deserialize(localVarResponse,  "", WebhookEvents200Response.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * webhook.list
  * List registered webhook on the store.
   * @param params Set this parameter in order to choose which entity fields you want to retrieve
   * @param start This parameter sets the number from which you want to get entities
   * @param count This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250
   * @param entity The entity you want to filter webhooks by (e.g. order or product)
   * @param action The action you want to filter webhooks by (e.g. add, update, or delete)
   * @param active The webhook status you want to filter webhooks by
   * @param ids List of сomma-separated webhook ids
   * @return WebhookList200Response
  */
  public WebhookList200Response webhookList (String params, Integer start, Integer count, String entity, String action, Boolean active, String ids) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;

    // create path and map variables
    String path = "/webhook.list.json";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "params", params));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "start", start));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "count", count));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "entity", entity));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "action", action));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "active", active));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "ids", ids));
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "StoreKeyAuth", "ApiKeyAuth" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (WebhookList200Response) ApiInvoker.deserialize(localVarResponse, "", WebhookList200Response.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * webhook.list
   * List registered webhook on the store.
   * @param params Set this parameter in order to choose which entity fields you want to retrieve   * @param start This parameter sets the number from which you want to get entities   * @param count This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250   * @param entity The entity you want to filter webhooks by (e.g. order or product)   * @param action The action you want to filter webhooks by (e.g. add, update, or delete)   * @param active The webhook status you want to filter webhooks by   * @param ids List of сomma-separated webhook ids
  */
  public void webhookList (String params, Integer start, Integer count, String entity, String action, Boolean active, String ids, final Response.Listener<WebhookList200Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;


    // create path and map variables
    String path = "/webhook.list.json".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "params", params));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "start", start));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "count", count));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "entity", entity));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "action", action));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "active", active));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "ids", ids));


    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] { "StoreKeyAuth", "ApiKeyAuth" };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((WebhookList200Response) ApiInvoker.deserialize(localVarResponse,  "", WebhookList200Response.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * webhook.update
  * Update Webhooks parameters.
   * @param id Webhook id
   * @param callback Callback url that returns shipping rates. It should be able to accept POST requests with json data.
   * @param label The name you give to the webhook
   * @param fields Fields the webhook should send
   * @param active Webhook status
   * @return ProductImageUpdate200Response
  */
  public ProductImageUpdate200Response webhookUpdate (String id, String callback, String label, String fields, Boolean active) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'id' when calling webhookUpdate",
        new ApiException(400, "Missing the required parameter 'id' when calling webhookUpdate"));
    }

    // create path and map variables
    String path = "/webhook.update.json";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "id", id));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "callback", callback));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "label", label));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "fields", fields));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "active", active));
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "StoreKeyAuth", "ApiKeyAuth" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (ProductImageUpdate200Response) ApiInvoker.deserialize(localVarResponse, "", ProductImageUpdate200Response.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * webhook.update
   * Update Webhooks parameters.
   * @param id Webhook id   * @param callback Callback url that returns shipping rates. It should be able to accept POST requests with json data.   * @param label The name you give to the webhook   * @param fields Fields the webhook should send   * @param active Webhook status
  */
  public void webhookUpdate (String id, String callback, String label, String fields, Boolean active, final Response.Listener<ProductImageUpdate200Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'id' when calling webhookUpdate",
        new ApiException(400, "Missing the required parameter 'id' when calling webhookUpdate"));
    }

    // create path and map variables
    String path = "/webhook.update.json".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "id", id));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "callback", callback));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "label", label));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "fields", fields));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "active", active));


    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] { "StoreKeyAuth", "ApiKeyAuth" };

    try {
      apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((ProductImageUpdate200Response) ApiInvoker.deserialize(localVarResponse,  "", ProductImageUpdate200Response.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
}
