# MarketplaceApi

All URIs are relative to *https://api.api2cart.com/v1.1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**marketplaceProductFind**](MarketplaceApi.md#marketplaceProductFind) | **GET** /marketplace.product.find.json | marketplace.product.find



## marketplaceProductFind

> ModelResponseMarketplaceProductFind marketplaceProductFind(storeId, count, pageCursor, categoriesIds, keyword, asin, ean, gtin, upc, mpn, isbn, params, exclude, responseFields)

marketplace.product.find

Search product in global catalog.

### Example

```java
// Import classes:
//import org.openapitools.client.api.MarketplaceApi;

MarketplaceApi apiInstance = new MarketplaceApi();
String storeId = 1; // String | Store Id
Integer count = 20; // Integer | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
String pageCursor = ; // String | Used to retrieve entities via cursor-based pagination (it can't be used with any other filtering parameter)
String categoriesIds = 23,56; // String | Defines product add that is specified by comma-separated categories id
String keyword = T-shirt; // String | Defines search keyword
String asin = 97703178470; // String | Amazon Standard Identification Number.
String ean = 5901234123457; // String | European Article Number. An EAN is a unique 8 or 13-digit identifier that many industries (such as book publishers) use to identify products.
String gtin = 12345678912345; // String | Global Trade Item Number. An GTIN is an identifier for trade items.
String upc = 9770317847001; // String | Universal Product Code. A UPC (UPC-A) is a commonly used identifer for many different products.
String mpn = 9770317847001; // String | Manufacturer Part Number. A MPN is an identifier of a particular part design or material used.
String isbn = 9783161484100; // String | International Standard Book Number. An ISBN is a unique identifier for books.
String params = id,model,price,images; // String | Set this parameter in order to choose which entity fields you want to retrieve
String exclude = false; // String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
String responseFields = {result}; // String | Set this parameter in order to choose which entity fields you want to retrieve
try {
    ModelResponseMarketplaceProductFind result = apiInstance.marketplaceProductFind(storeId, count, pageCursor, categoriesIds, keyword, asin, ean, gtin, upc, mpn, isbn, params, exclude, responseFields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketplaceApi#marketplaceProductFind");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Store Id | [optional] [default to null]
 **count** | **Integer**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional] [default to 10]
 **pageCursor** | **String**| Used to retrieve entities via cursor-based pagination (it can&#39;t be used with any other filtering parameter) | [optional] [default to null]
 **categoriesIds** | **String**| Defines product add that is specified by comma-separated categories id | [optional] [default to null]
 **keyword** | **String**| Defines search keyword | [optional] [default to null]
 **asin** | **String**| Amazon Standard Identification Number. | [optional] [default to null]
 **ean** | **String**| European Article Number. An EAN is a unique 8 or 13-digit identifier that many industries (such as book publishers) use to identify products. | [optional] [default to null]
 **gtin** | **String**| Global Trade Item Number. An GTIN is an identifier for trade items. | [optional] [default to null]
 **upc** | **String**| Universal Product Code. A UPC (UPC-A) is a commonly used identifer for many different products. | [optional] [default to null]
 **mpn** | **String**| Manufacturer Part Number. A MPN is an identifier of a particular part design or material used. | [optional] [default to null]
 **isbn** | **String**| International Standard Book Number. An ISBN is a unique identifier for books. | [optional] [default to null]
 **params** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to force_all]
 **exclude** | **String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] [default to null]
 **responseFields** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to null]

### Return type

[**ModelResponseMarketplaceProductFind**](ModelResponseMarketplaceProductFind.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

