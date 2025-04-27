# AccountApi

All URIs are relative to *https://api.api2cart.com/v1.1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accountCartAdd**](AccountApi.md#accountCartAdd) | **POST** /account.cart.add.json | account.cart.add
[**accountCartList**](AccountApi.md#accountCartList) | **GET** /account.cart.list.json | account.cart.list
[**accountConfigUpdate**](AccountApi.md#accountConfigUpdate) | **PUT** /account.config.update.json | account.config.update
[**accountFailedWebhooks**](AccountApi.md#accountFailedWebhooks) | **GET** /account.failed_webhooks.json | account.failed_webhooks
[**accountSupportedPlatforms**](AccountApi.md#accountSupportedPlatforms) | **GET** /account.supported_platforms.json | account.supported_platforms



## accountCartAdd

> AccountCartAdd200Response accountCartAdd(accountCartAdd)

account.cart.add

Use this method to automate the process of connecting stores to API2Cart. The list of parameters will vary depending on the platform. To get a list of parameters that are specific to a particular shopping platform, you need to execute the account.supported_platforms.json method.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AccountApi;

AccountApi apiInstance = new AccountApi();
AccountCartAdd accountCartAdd = new AccountCartAdd(); // AccountCartAdd | 
try {
    AccountCartAdd200Response result = apiInstance.accountCartAdd(accountCartAdd);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#accountCartAdd");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountCartAdd** | [**AccountCartAdd**](AccountCartAdd.md)|  |

### Return type

[**AccountCartAdd200Response**](AccountCartAdd200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## accountCartList

> AccountCartList200Response accountCartList(storeUrl, storeKey, requestFromDate, requestToDate, params, exclude)

account.cart.list

This method lets you get a list of online stores connected to your API2Cart account. You can get the number of API requests to each store if you specify a period using parameters (request_from_date, request_to_date). The total_calls field is displayed only if there are parameters (request_from_date, request_to_date).

### Example

```java
// Import classes:
//import org.openapitools.client.api.AccountApi;

AccountApi apiInstance = new AccountApi();
String storeUrl = http://mystore.com; // String | A web address of a store
String storeKey = ab37fc230bc5df63a5be1b11220949be; // String | Find store by store key
String requestFromDate = 2010-07-29; // String | Retrieve entities from their creation date
String requestToDate = 2100-08-29; // String | Retrieve entities to their creation date
String params = url,store_key; // String | Set this parameter in order to choose which entity fields you want to retrieve
String exclude = url,store_key; // String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
try {
    AccountCartList200Response result = apiInstance.accountCartList(storeUrl, storeKey, requestFromDate, requestToDate, params, exclude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#accountCartList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeUrl** | **String**| A web address of a store | [optional] [default to null]
 **storeKey** | **String**| Find store by store key | [optional] [default to null]
 **requestFromDate** | **String**| Retrieve entities from their creation date | [optional] [default to null]
 **requestToDate** | **String**| Retrieve entities to their creation date | [optional] [default to null]
 **params** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to force_all]
 **exclude** | **String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] [default to null]

### Return type

[**AccountCartList200Response**](AccountCartList200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## accountConfigUpdate

> AccountConfigUpdate200Response accountConfigUpdate(replaceParameters, newStoreUrl, newStoreKey, bridgeUrl, storeRoot, dbTablesPrefix, userAgent, _3dcartPrivateKey, _3dcartAccessToken, _3dcartapiApiKey, amazonSpClientId, amazonSpClientSecret, amazonSpRefreshToken, amazonSpAwsRegion, amazonSpApiEnvironment, amazonSellerId, aspdotnetstorefrontApiUser, aspdotnetstorefrontApiPass, bigcommerceapiAdminAccount, bigcommerceapiApiPath, bigcommerceapiApiKey, bigcommerceapiClientId, bigcommerceapiAccessToken, bigcommerceapiContext, bolApiKey, bolApiSecret, bolRetailerId, demandwareClientId, demandwareApiPassword, demandwareUserName, demandwareUserPassword, ebayClientId, ebayClientSecret, ebayRuname, ebayAccessToken, ebayRefreshToken, ebayEnvironment, ebaySiteId, ecwidAcessToken, ecwidStoreId, lazadaAppId, lazadaAppSecret, lazadaRefreshToken, lazadaRegion, etsyKeystring, etsySharedSecret, etsyAccessToken, etsyTokenSecret, etsyClientId, etsyRefreshToken, facebookAppId, facebookAppSecret, facebookAccessToken, facebookBusinessId, netoApiKey, netoApiUsername, shoplineAccessToken, shoplineAppKey, shoplineAppSecret, shoplineSharedSecret, shopifyAccessToken, shopifyApiKey, shopifyApiPassword, shopifySharedSecret, shoplazzaAccessToken, shoplazzaSharedSecret, mivaAccessToken, mivaSignature, shopwareAccessKey, shopwareApiKey, shopwareApiSecret, volusionLogin, volusionPassword, walmartClientId, walmartClientSecret, walmartEnvironment, walmartChannelType, walmartRegion, squareClientId, squareClientSecret, squareRefreshToken, squarespaceApiKey, squarespaceClientId, squarespaceClientSecret, squarespaceAccessToken, squarespaceRefreshToken, hybrisClientId, hybrisClientSecret, hybrisUsername, hybrisPassword, hybrisWebsites, lightspeedApiKey, lightspeedApiSecret, commercehqApiKey, commercehqApiPassword, wcConsumerKey, wcConsumerSecret, magentoConsumerKey, magentoConsumerSecret, magentoAccessToken, magentoTokenSecret, prestashopWebserviceKey, wixAppId, wixAppSecretKey, wixInstanceId, wixRefreshToken, mercadoLibreAppId, mercadoLibreAppSecretKey, mercadoLibreRefreshToken, zidClientId, zidClientSecret, zidAccessToken, zidAuthorization, zidRefreshToken, flipkartClientId, flipkartClientSecret, allegroClientId, allegroClientSecret, allegroAccessToken, allegroRefreshToken, allegroEnvironment, zohoClientId, zohoClientSecret, zohoRefreshToken, zohoRegion, tiendanubeUserId, tiendanubeAccessToken, tiendanubeClientSecret, ottoClientId, ottoClientSecret, ottoAppId, ottoRefreshToken, ottoEnvironment, ottoAccessToken, tiktokshopAppKey, tiktokshopAppSecret, tiktokshopRefreshToken, tiktokshopAccessToken, sallaClientId, sallaClientSecret, sallaRefreshToken, sallaAccessToken)

account.config.update

Use this method to automate the change of credentials used to connect online stores. The list of supported parameters differs depending on the platform.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AccountApi;

AccountApi apiInstance = new AccountApi();
Boolean replaceParameters = true; // Boolean | Identifies if there is a necessity to replace parameters
String newStoreUrl = http://mystore.com; // String | The web address of the store you want to update to connect to API2Cart
String newStoreKey = b636495648de3086f6f57b1bd4be548f; // String | Update store key
String bridgeUrl = https://your-store.com/custom/bridge/path/bridge.php; // String | This parameter allows to set up store with custom bridge url (also you must use store_root parameter if a bridge folder is not in the root folder of the store)
String storeRoot = /home/www/stores/magento1922; // String | Absolute path to the store root directory (used with \"bridge_url\" parameter)
String dbTablesPrefix = oc_; // String | DB tables prefix
String userAgent = Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:47.0) Gecko/20100101 Firefox/47.0; // String | This parameter allows you to set your custom user agent, which will be used in requests to the store. Please use it cautiously, as the store's firewall may block specific values.
String _3dcartPrivateKey = 7dba81f90bdbe25e7000e73214ca51b; // String | 3DCart Private Key
String _3dcartAccessToken = 4Grr_ZCLNNoSUuhAjesKuchxo9SL; // String | 3DCart Token
String _3dcartapiApiKey = 82cc921c6a5c67082cc921c6a5c6707e1d6e6862ba3201a; // String | 3DCart API Key
String amazonSpClientId = amzn1.application-oa2-client.11e000e1f47d4998aca3733716d3b5a4; // String | Amazon SP API app client id
String amazonSpClientSecret = 2c987428209f235443221255bde064f4bdf8a65165a80f5d22760a83cb; // String | Amazon SP API app client secret
String amazonSpRefreshToken = Atzr|IwEBIPUI-bwRTdDgKNQ_g56C30wGqymtx30c9MdDC7Emwmojhs20k5BBG2hHtJiGZ_7OfG7khd1RuQr6KEst4qyWbo_eXi5S_T_VOxzJUuksG1cFOGFpFK-cnhReNzAeZIpZeJT7_ROy1csEFlQfC8FJS3bsbSkkbTz2ZcTN7_7ey0HVlhyfFizgROeSeOI24Wjs9l_KKzZW0jvi_oC2cxlIcyknnHLK6KMNz2rTXqQJWRtlK9xPJDdbcUa5STA8MQru91cxNBpSkZN_cq9OOELhbsIGKD75y7nZ3yJU4uHQC_9iBQQoFm0biKgi-kEQwOhwws8; // String | Amazon SP API OAuth refresh token
String amazonSpAwsRegion = us-east-1; // String | Amazon AWS Region
String amazonSpApiEnvironment = sandbox; // String | Amazon SP API environment
String amazonSellerId = 13P636B2M1N4WR; // String | Amazon Seller ID (Merchant token)
String aspdotnetstorefrontApiUser = admin; // String | It's a AspDotNetStorefront account for which API is available
String aspdotnetstorefrontApiPass = f6471ef78f72b41849a8b8b67791b0b5; // String | AspDotNetStorefront API Password
String bigcommerceapiAdminAccount = admin; // String | It's a BigCommerce account for which API is enabled
String bigcommerceapiApiPath = http://mystore.bigcommerce.com/api/v1; // String | BigCommerce API URL
String bigcommerceapiApiKey = 6b89704cd75738cb0f9f6468d5462aba; // String | Bigcommerce API Key
String bigcommerceapiClientId = p1r37bt131z86675nofv9xmhietoe4t; // String | Client ID of the requesting app
String bigcommerceapiAccessToken = igse8e4rdmzkxdi937qe69d59en1imw; // String | Access token authorizing the app to access resources on behalf of a user
String bigcommerceapiContext = stores/etplnf8o8v; // String | API Path section unique to the store
String bolApiKey = 51369628-feee-11ed-be56-0242ac120002; // String | Bol API Key
String bolApiSecret = 8fGzEsbEP5z2MNZubmIil87m-sWzTkj?KDQKrmzmU!fA6aAUNMdKRp7LMWHwE!G37UMfnWByHBGSXJHkAG?QcuYTO2uklv4idIHwUMLHK!OO1yfRlWh!; // String | Bol API Secret
Integer bolRetailerId = 145001; // Integer | Bol Retailer ID
String demandwareClientId = b849eb85-v8b9-1dw8-9fe2-97e1d6ffc7b0; // String | Demandware client id
String demandwareApiPassword = testpassword; // String | Demandware api password
String demandwareUserName = admin; // String | Demandware user name
String demandwareUserPassword = 12345; // String | Demandware user password
String ebayClientId = a9psel85v1wy5faeyjw03y0r; // String | Application ID (AppID).
String ebayClientSecret = gmz3iz45x2; // String | Shared Secret from eBay application
String ebayRuname = gmz3iz45x2; // String | The RuName value that eBay assigns to your application.
String ebayAccessToken = v^1.1#i ... AjRV4yNjA=; // String | Used to authenticate API requests.
String ebayRefreshToken = v^1.1#i ... rAewqVasdA=; // String | Used to renew the access token.
String ebayEnvironment = sandbox; // String | eBay environment
Integer ebaySiteId = 101; // Integer | eBay global ID
String ecwidAcessToken = igse8e4rdmzkxdi937qe69d59en1imw; // String | Access token authorizing the app to access resources on behalf of a user
String ecwidStoreId = 1; // String | Store Id
String lazadaAppId = 112577; // String | Lazada App ID
String lazadaAppSecret = er33raICJ79Q5b0EsR9stmRnjE9XQ2WH; // String | Lazada App Secret
String lazadaRefreshToken = EAAPP06rM2n8BO4mZBuMPnu9zS0MaMbN7ue8aUkcxw4zewU337mVVb5br; // String | Lazada Refresh Token
String lazadaRegion = Malaysia; // String | Lazada API endpoint Region
String etsyKeystring = a9psel85v1wy5faeyjw03y0r; // String | Etsy keystring
String etsySharedSecret = gmz3iz45x2; // String | Etsy shared secret
String etsyAccessToken = igse8e4rdmzkxdi937qe69d59en1imw; // String | Access token authorizing the app to access resources on behalf of a user
String etsyTokenSecret = igse8e4rdmzkxdi937qe69d59en1imw; // String | Secret token authorizing the app to access resources on behalf of a user
String etsyClientId = w0fi0igk2w29bjcd7ydr2s35; // String | Etsy Client Id
String etsyRefreshToken = 223577551.L07_RE-y7unmKf2dox4djsHkVxwpUfs1ikG_uQmHhF-aASEReNn_Qns1Wqn3dDa0ZMxrt9CIael3dgudeDZb31ZUdS; // String | Etsy Refresh token
String facebookAppId = 6516912365277570; // String | Facebook App ID
String facebookAppSecret = 737cf6bd2879cb6c7e5a8ff9cd63f3d46b0b5b7b; // String | Facebook App Secret
String facebookAccessToken = EAAPP06rM2n8BO4mZBuMPnu9zS0MaMbN7ue8aUAhqbS58clzJwyp1rYRMpP31QJGziqtYbKypdVx3Cs0RpuufoUeLsbfX195XIB8VTlkcxw4zewU337mVVb5br; // String | Facebook Access Token
String facebookBusinessId = 294042786906655; // String | Facebook Business ID
String netoApiKey = bbca57d8ff3c3677128112c15556d9e3; // String | Neto API Key
String netoApiUsername = mylogin; // String | Neto User Name
String shoplineAccessToken = igse8e4rdmzkxdi937qe69d59en1imw; // String | Shopline APP Key
String shoplineAppKey = 737cf6bd2879cb6c7e5a8ff9cd63f3d46b0b5b7b; // String | Shopline APP Key
String shoplineAppSecret = 1701d123bb5cc14cd2732dcaed90638316c0a09; // String | Shopline App Secret
String shoplineSharedSecret = 1701d123bb5cc14cd2732dcaed90638316c0a09; // String | Shopline Shared Secret
String shopifyAccessToken = igse8e4rdmzkxdi937qe69d59en1imw; // String | Access token authorizing the app to access resources on behalf of a user
String shopifyApiKey = bbca57d8ff3c3677128112c15556d9e3; // String | Shopify API Key
String shopifyApiPassword = 860f3a6fc87632301a42cd88e4b5ab3d; // String | Shopify API Password
String shopifySharedSecret = gmz3iz45x2; // String | Shared secret
String shoplazzaAccessToken = igse8e4rdmzkxdi937qe69d59en1imw; // String | Access token authorizing the app to access resources on behalf of a user
String shoplazzaSharedSecret = gmz3iz45x2; // String | Shared secret
String mivaAccessToken = 227cbe434a1e358d72db0de993x9d9fd; // String | Miva access token
String mivaSignature = 1hpkrebfdsObGTor/0Gk9XcNBUQohrxrw67Sg9AM9ps=; // String | Miva signature
String shopwareAccessKey = SWSCS3O1RJBSRNBYQLFIYJN2ZQ; // String | Shopware access key
String shopwareApiKey = SWSCS3O1RJBSRNBYQLFIYJN2ZQ; // String | Shopware api key
String shopwareApiSecret = V3NYNWg2b1dZdHBUWDN1cmdKdGhnenp5enVJYlJ0WlJvOFF2bnQ; // String | Shopware client secret access key
String volusionLogin = admin; // String | It's a Volusion account for which API is enabled
String volusionPassword = 7943CA5F3990E00D9A4CCF0BD998211F; // String | Volusion API Password
String walmartClientId = 423f6A24-123z-8654-989u-6fa96478289; // String | Walmart client ID. For the region 'ca' use Consumer ID
String walmartClientSecret = 1gf85fea-8974-2648-w12w-rt54284tdf54; // String | Walmart client secret. For the region 'ca' use Private Key
String walmartEnvironment = production; // String | Walmart environment
String walmartChannelType = 0f3e4dd4-0514-4346-b39d-af0e00ea066d; // String | Walmart WM_CONSUMER.CHANNEL.TYPE header
String walmartRegion = us; // String | Walmart region
String squareClientId = sq0idp-qwer_1pvuTYe9cAf1lmxyQ; // String | Square (Weebly) Client ID
String squareClientSecret = c8d7077fce7b2b111111111898170695a01473a2ad; // String | Square (Weebly) Client Secret
String squareRefreshToken = EQAAlquVXMr6xIcPu7qPkIEAZ0thqChhQuowrvZIqOlwhOwhtmyh4ZRfesdRc434; // String | Square (Weebly) Refresh Token
String squarespaceApiKey = 8f7849d5-1411-47f2-9722-aa81c2a48d95; // String | Squarespace API Key
String squarespaceClientId = 9UGbUtS2V96BxRGmfOjsGAhTdsr9Vxxx; // String | Squarespace Connector Client ID
String squarespaceClientSecret = GPZkUFkIKWg0KLE6rajsFMMYA9ma0udaaq2bYwBDXXX=; // String | Squarespace Connector Client Secret
String squarespaceAccessToken = SWSCS3O1RJBSRNBYQLFIYJN2ZQ; // String | Squarespace access token
String squarespaceRefreshToken = def50eyfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe657e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65de64a0c865d; // String | Squarespace refresh token
String hybrisClientId = api_client_1; // String | Omni Commerce Connector Client ID
String hybrisClientSecret = secret_phrase_1; // String | Omni Commerce Connector Client Secret
String hybrisUsername = admin; // String | User Name
String hybrisPassword = nimda; // String | User password
List<String> hybrisWebsites = hybris_websites[0][uid]=apparel-website&hybris_websites[0][url]=https://apparel.local/yacceleratorstorefront&hybris_websites[0][storeIds][0]=apparel-de&hybris_websites[0][storeIds][1]=apparel-uk; // List<String> | Websites to stores mapping data
String lightspeedApiKey = cf5444729c2abd6b6a5d983691767cb5; // String | LightSpeed api key
String lightspeedApiSecret = 2620ee52a8bc942f9d5d3a575f4d363e; // String | LightSpeed api secret
String commercehqApiKey = sJrD-LM0eddhe63rfgfva0dDydXfre4; // String | CommerceHQ api key
String commercehqApiPassword = 4Grr_ZCLNNoSUuhAjesKuchxo9SL; // String | CommerceHQ api password
String wcConsumerKey = ck_26d8e2ad604f3917e429df6961722282bdcf109d; // String | Woocommerce consumer key
String wcConsumerSecret = cs_931ced666118a15c5f7b4a33a15gf5589cbeba55; // String | Woocommerce consumer secret
String magentoConsumerKey = ktv4n9rgrj0evjuy2t6p2xlb1f8u5pmy; // String | Magento Consumer Key
String magentoConsumerSecret = a46abc3kxyinlbggy06i9g975xqo6gjq; // String | Magento Consumer Secret
String magentoAccessToken = igse8e4rdmzkxdi937qe69d59en1imw; // String | Magento Access Token
String magentoTokenSecret = igse8e4rdmzkxdi937qe69d59en1imw; // String | Magento Token Secret
String prestashopWebserviceKey = CKJ1ZEWRJWRLTPVBQJ9FGGRORD4AGS96; // String | Prestashop webservice key
String wixAppId = 6b0b5b7b-7d87-45b5-bf34-ac6b438e63da; // String | Wix App ID
String wixAppSecretKey = 316c0a09-f195-42be-74f6-a02cebb9cae6; // String | Wix App Secret Key
String wixInstanceId = 58b893a4-6b16-5c2f-qt78-qa3r61t32rt8; // String | Wix Instance ID
String wixRefreshToken = 
        OAUTH2.eyJraWQiOiJkZ0x3cjNRMCIsImFsZyI6IkhTMjU2In0.
        eyJkYXRhIjoie1wiaWRcIjpcImJlZjM3MmRmLTUyNGItNDI3NS05M2RkL
        Tg4NDBlOTU3ZWU2OFwifSIsImlhdCI6MTY0ODA0NTEyNiwiZXhwIjoxNzExMTE3MTI2fQ.
        VRR2lGSbcTVmaArtmyyhy6o4WRDwTn-nlDCQpZ97eYw
      ; // String | Wix refresh token
String mercadoLibreAppId = 211188015100135; // String | Mercado Libre App ID
String mercadoLibreAppSecretKey = e2qoG2zklLlfP7cEngEJ94YjhkejkjAm; // String | Mercado Libre App Secret Key
String mercadoLibreRefreshToken = TG-63h13529vb5464110188d2x9-703754376; // String | Mercado Libre Refresh Token
Integer zidClientId = 1234; // Integer | Zid Client ID
String zidClientSecret = nl5l1lE0vxgv6cV111fHsdlOOIfb0Ms5IR7l4Igs; // String | Zid Client Secret
String zidAccessToken = def50eyfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe657e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65de64a0c865d; // String | Zid Access Token
String zidAuthorization = def50eyfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe657e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65de64a0c865d; // String | Zid Authorization
String zidRefreshToken = def50eyfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe657e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65de64a0c865d; // String | Zid refresh token
String flipkartClientId = 19414773883a13a850b6a52350b7246499a24; // String | Flipkart Client ID
String flipkartClientSecret = nl5l1lE0vxgv6cV111fHsdlOOIfb0Ms5IR7l4Igs; // String | Flipkart Client Secret
String allegroClientId = 2915e189ce3d23d23d2327d204ae6a0bd; // String | Allegro Client ID
String allegroClientSecret = DNHtqdL2WPIefeUhQWYgtXPS23fgbfgasdsGHHJGhg3RTFDQWFGZmVoFRT5IfkQj1E7eR5; // String | Allegro Client Secret
String allegroAccessToken = eyJhbGciOiJSUzI1NiIsInR5cCI6IsfddfdfdeyJ1c2VyX25hbWUiOiI5NDUxMzE1MSIsInNjb3BlIjpbImFsbGVncm86YXBpOm9yZGVyczpyZWFkIiwiYWxsZWdybzphcGk6cHJvZmlsZTp3cml0ZSIsImFsbGVncm86YXBpOnNhbGU6b2ZmZXJzOndyaXRlIiwiYWxsZWdybzphcGk6YmlsbGluZzpyZWFkIiwiYWxsZWdybzphcGk6Y2FtcGFpZ25zIiwiYWxsZWdybzphcGk6ZGlzcHV0ZXMiLCJhbGxlZ3JvOmFwaTpzYWxlOm9mZmVyczpyZWFkIiwiYWxsZWdybzphcGk6YmlkcyIsImFsbGVncm86YXBpOm9yZGVyczp3cml0ZSIsImFsbGVncm86YXBpOnBheW1lbnRzOndyaXRlIiwiYWxsZWdybzphcGk6c2FsZTpzZXR0aW5nczp3cml0ZSIsImFsbGVncm86YXBpOnByb2ZpbGU6cmVhZCIsImFsbGVncm86YXBpOnJhdGluZ3MiLCJhbGxlZ3JvOmFwaTpzYWxlOnNldHRpbmdzOnJlYWQiLCJhbGxlZ3JvOmFwaTpwYXltZW50czpyZWFkIiwiYWxsZWdybzphcGk6bWVzc2FnaW5nIl0sI; // String | Allegro Access Token
String allegroRefreshToken = eyJhbGciOiJSUzI1NiIsInR5cCI6IsfddfdfdeyJ1c2VyX25hbWUiOiI5NDUxMzE1MSIsInNjb3BlIjpbImFsbGVncm86YXBpOm9yZGVyczpyZWFkIiwiYWxsZWdybzphcGk6cHJvZmlsZTp3cml0ZSIsImFsbGVncm86YXBpOnNhbGU6b2ZmZXJzOndyaXRlIiwiYWxsZWdybzphcGk6YmlsbGluZzpyZWFkIiwiYWxsZWdybzphcGk6Y2FtcGFpZ25zIiwiYWxsZWdybzphcGk6ZGlzcHV0ZXMiLCJhbGxlZ3JvOmFwaTpzYWxlOm9mZmVyczpyZWFkIiwiYWxsZWdybzphcGk6YmlkcyIsImFsbGVncm86YXBpOm9yZGVyczp3cml0ZSIsImFsbGVncm86YXBpOnBheW1lbnRzOndyaXRlIiwiYWxsZWdybzphcGk6c2FsZTpzZXR0aW5nczp3cml0ZSIsImFsbGVncm86YXBpOnByb2ZpbGU6cmVhZCIsImFsbGVncm86YXBpOnJhdGluZ3MiLCJhbGxlZ3JvOmFwaTpzYWxlOnNldHRpbmdzOnJlYWQiLCJhbGxlZ3JvOmFwaTpwYXltZW50czpyZWFkIiwiYWxsZWdybzphcGk6bWVzc2FnaW5nIl0sI; // String | Allegro Refresh Token
String allegroEnvironment = sandbox; // String | Allegro Environment
String zohoClientId = 1000.FLCHGI2LS1111111TOR4OGB697W4IX; // String | Zoho Client ID
String zohoClientSecret = c8d7077fce7b2b111111111898170695a01473a2ad; // String | Zoho Client Secret
String zohoRefreshToken = 1000.11111111111111111111111111111111.1b3ca6f054341a111118abf928beb33b; // String | Zoho Refresh Token
String zohoRegion = Europe; // String | Zoho API endpoint Region
Integer tiendanubeUserId = 1234; // Integer | Tiendanube User ID
String tiendanubeAccessToken = 75bde7bb0b437475423e7e87c142c06052f80199; // String | Tiendanube Access Token
String tiendanubeClientSecret = 5e3588f514a5ae0d0fa063d1b556531e25c83fa7e47472ed; // String | Tiendanube Client Secret
String ottoClientId = 911a3dbf-d261-4763-cc81-052876465b55; // String | Otto Client ID
String ottoClientSecret = 9887a82a-2879-421e-a6wc-54e986b3458c; // String | Otto Client Secret
String ottoAppId = 6eaef6a3-822e-425b-8mc9-53750063e34d; // String | Otto App ID
String ottoRefreshToken = eyJhbGciOiJSUzI1NiIsInR5cCI6IsfddfdfdeyJ1c2VyX25hbWUiOiI5NDUxMzE1MSIsInNjb3BlIjpbImFsbGVncm86YXBpOm9yZGVyczpyZWFkIiwiYWxsZWdybzphcGk6cHJvZmlsZTp3cml0ZSIsImFsbGVncm86YXBpOnNhbGU6b2ZmZXJzOndyaXRlIiwiYWxsZWdybzphcGk6YmlsbGluZzpyZWFkIiwiYWxsZWdybzphcGk6Y2FtcGFpZ25zIiwiYWxsZWdybzphcGk6ZGlzcHV0ZXMiLCJhbGxlZ3JvOmFwaTpzYWxlOm9mZmVyczpyZWFkIiwiYWxsZWdybzphcGk6YmlkcyIsImFsbGVncm86YXBpOm9yZGVyczp3cml0ZSIsImFsbGVncm86YXBpOnBheW1lbnRzOndyaXRlIiwiYWxsZWdybzphcGk6c2FsZTpzZXR0aW5nczp3cml0ZSIsImFsbGVncm86YXBpOnByb2ZpbGU6cmVhZCIsImFsbGVncm86YXBpOnJhdGluZ3MiLCJhbGxlZ3JvOmFwaTpzYWxlOnNldHRpbmdzOnJlYWQiLCJhbGxlZ3JvOmFwaTpwYXltZW50czpyZWFkIiwiYWxsZWdybzphcGk6bWVzc2FnaW5nIl0sI; // String | Otto Refresh Token
String ottoEnvironment = sandbox; // String | Otto Environment
String ottoAccessToken = eyJhbGciOiJS34535f45f54f5656deyJ1c2VyX25hbWUiOiI5NDUxMzE1MSIsInNjb3BlIjpbImFsbGVncm86YXBpOm9yZGVyczpyZWFkIiwiYWxsZWdybzphcGk6cHJvZmlsZTp3cml0ZSIsImFsbGVncm86YXBpOnNhbGU6b2ZmZXJzOndyaXRlIiwiYWxsZWdybzphcGk6YmlsbGluZzpyZWFkIiwiYWxsZWdybzphcGk6Y2FtcGFpZ25zIiwiYWxsZWdybzphcGk6ZGlzcHV0ZXMiLCJhbGxlZ3JvOmFwaTpzYWxlOm9mZmVyczpyZWFkIiwiYWxsZWdybzphcGk6YmlkcyIsImFsbGVncm86YXBpOm9yZGVyczp3cml0ZSIsImFsbGVncm86YXBpOnBheW1lbnRzOndyaXRlIiwiYWxsZWdybzphcGk6c2FsZTpzZXR0aW5nczp3cml0ZSIsImFsbGVncm86YXBpOnByb2ZpbGU6cmVhZCIsImFsbGVncm86YXBpOnJhdGluZ3MiLCJhbGxlZ3JvOmFwaTpzYWxlOnNldHRpbmdzOnJlYWQiLCJhbGxlZ3JvOmFwaTpwYXltZW50czpyZWFkIiwiYWxsZWdybzphcGk6bWVzc2FnaW5nIl0sI; // String | Otto Access Token
String tiktokshopAppKey = 6arbhkzno8nbv; // String | TikTok Shop App Key
String tiktokshopAppSecret = d95820a05a0cd54fb394fcd26fgat63999b183bc; // String | TikTok Shop App Secret
String tiktokshopRefreshToken = TTP_NTUxZTNhYTQ2ZDk2YmRmZWNmYWY2YWY12345NGYwNjQ3YjkzYTllYjA0YmNlMw; // String | TikTok Shop Refresh Token
String tiktokshopAccessToken = TTP_Fw8r12345kW03FYd09DG-9INtpw361hWthei12345iPJ5AUv99fLSCYD9-Uu12345TgNRzKZxi5-tfFMtdWqglEt5_iCk; // String | TikTok Shop Access Token
String sallaClientId = 1bxxxcf9-5xx4-xxx-bxxf-929b8xxxxe11; // String | Salla Client ID
String sallaClientSecret = 8x88axxxc25e1fxxxa1c06fxxx150xx5; // String | Salla Client Secret
String sallaRefreshToken = oxy_rt_zxxxxiY2xxZWWxxxxlU-tROxxxxx2JzS2fwzxxxxxkU.p3xxxkCIyFexxxxP50WwZYfhw5_wg1xxxxV5F-8xxXc; // String | Salla Refresh Token
String sallaAccessToken = oxy_rt_zxxxxiY2xxZWWxxxxlU-tROxxxxx2JzS2fwzxxxxxkU.p3xxxkCIyFexxxxP50WwZYfhw5_wg1xxxxV5F-8xxXc; // String | Salla Access Token
try {
    AccountConfigUpdate200Response result = apiInstance.accountConfigUpdate(replaceParameters, newStoreUrl, newStoreKey, bridgeUrl, storeRoot, dbTablesPrefix, userAgent, _3dcartPrivateKey, _3dcartAccessToken, _3dcartapiApiKey, amazonSpClientId, amazonSpClientSecret, amazonSpRefreshToken, amazonSpAwsRegion, amazonSpApiEnvironment, amazonSellerId, aspdotnetstorefrontApiUser, aspdotnetstorefrontApiPass, bigcommerceapiAdminAccount, bigcommerceapiApiPath, bigcommerceapiApiKey, bigcommerceapiClientId, bigcommerceapiAccessToken, bigcommerceapiContext, bolApiKey, bolApiSecret, bolRetailerId, demandwareClientId, demandwareApiPassword, demandwareUserName, demandwareUserPassword, ebayClientId, ebayClientSecret, ebayRuname, ebayAccessToken, ebayRefreshToken, ebayEnvironment, ebaySiteId, ecwidAcessToken, ecwidStoreId, lazadaAppId, lazadaAppSecret, lazadaRefreshToken, lazadaRegion, etsyKeystring, etsySharedSecret, etsyAccessToken, etsyTokenSecret, etsyClientId, etsyRefreshToken, facebookAppId, facebookAppSecret, facebookAccessToken, facebookBusinessId, netoApiKey, netoApiUsername, shoplineAccessToken, shoplineAppKey, shoplineAppSecret, shoplineSharedSecret, shopifyAccessToken, shopifyApiKey, shopifyApiPassword, shopifySharedSecret, shoplazzaAccessToken, shoplazzaSharedSecret, mivaAccessToken, mivaSignature, shopwareAccessKey, shopwareApiKey, shopwareApiSecret, volusionLogin, volusionPassword, walmartClientId, walmartClientSecret, walmartEnvironment, walmartChannelType, walmartRegion, squareClientId, squareClientSecret, squareRefreshToken, squarespaceApiKey, squarespaceClientId, squarespaceClientSecret, squarespaceAccessToken, squarespaceRefreshToken, hybrisClientId, hybrisClientSecret, hybrisUsername, hybrisPassword, hybrisWebsites, lightspeedApiKey, lightspeedApiSecret, commercehqApiKey, commercehqApiPassword, wcConsumerKey, wcConsumerSecret, magentoConsumerKey, magentoConsumerSecret, magentoAccessToken, magentoTokenSecret, prestashopWebserviceKey, wixAppId, wixAppSecretKey, wixInstanceId, wixRefreshToken, mercadoLibreAppId, mercadoLibreAppSecretKey, mercadoLibreRefreshToken, zidClientId, zidClientSecret, zidAccessToken, zidAuthorization, zidRefreshToken, flipkartClientId, flipkartClientSecret, allegroClientId, allegroClientSecret, allegroAccessToken, allegroRefreshToken, allegroEnvironment, zohoClientId, zohoClientSecret, zohoRefreshToken, zohoRegion, tiendanubeUserId, tiendanubeAccessToken, tiendanubeClientSecret, ottoClientId, ottoClientSecret, ottoAppId, ottoRefreshToken, ottoEnvironment, ottoAccessToken, tiktokshopAppKey, tiktokshopAppSecret, tiktokshopRefreshToken, tiktokshopAccessToken, sallaClientId, sallaClientSecret, sallaRefreshToken, sallaAccessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#accountConfigUpdate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **replaceParameters** | **Boolean**| Identifies if there is a necessity to replace parameters | [optional] [default to null]
 **newStoreUrl** | **String**| The web address of the store you want to update to connect to API2Cart | [optional] [default to null]
 **newStoreKey** | **String**| Update store key | [optional] [default to null]
 **bridgeUrl** | **String**| This parameter allows to set up store with custom bridge url (also you must use store_root parameter if a bridge folder is not in the root folder of the store) | [optional] [default to null]
 **storeRoot** | **String**| Absolute path to the store root directory (used with \&quot;bridge_url\&quot; parameter) | [optional] [default to null]
 **dbTablesPrefix** | **String**| DB tables prefix | [optional] [default to null]
 **userAgent** | **String**| This parameter allows you to set your custom user agent, which will be used in requests to the store. Please use it cautiously, as the store&#39;s firewall may block specific values. | [optional] [default to null]
 **_3dcartPrivateKey** | **String**| 3DCart Private Key | [optional] [default to null]
 **_3dcartAccessToken** | **String**| 3DCart Token | [optional] [default to null]
 **_3dcartapiApiKey** | **String**| 3DCart API Key | [optional] [default to null]
 **amazonSpClientId** | **String**| Amazon SP API app client id | [optional] [default to null]
 **amazonSpClientSecret** | **String**| Amazon SP API app client secret | [optional] [default to null]
 **amazonSpRefreshToken** | **String**| Amazon SP API OAuth refresh token | [optional] [default to null]
 **amazonSpAwsRegion** | **String**| Amazon AWS Region | [optional] [default to null]
 **amazonSpApiEnvironment** | **String**| Amazon SP API environment | [optional] [default to production]
 **amazonSellerId** | **String**| Amazon Seller ID (Merchant token) | [optional] [default to null]
 **aspdotnetstorefrontApiUser** | **String**| It&#39;s a AspDotNetStorefront account for which API is available | [optional] [default to null]
 **aspdotnetstorefrontApiPass** | **String**| AspDotNetStorefront API Password | [optional] [default to null]
 **bigcommerceapiAdminAccount** | **String**| It&#39;s a BigCommerce account for which API is enabled | [optional] [default to null]
 **bigcommerceapiApiPath** | **String**| BigCommerce API URL | [optional] [default to null]
 **bigcommerceapiApiKey** | **String**| Bigcommerce API Key | [optional] [default to null]
 **bigcommerceapiClientId** | **String**| Client ID of the requesting app | [optional] [default to null]
 **bigcommerceapiAccessToken** | **String**| Access token authorizing the app to access resources on behalf of a user | [optional] [default to null]
 **bigcommerceapiContext** | **String**| API Path section unique to the store | [optional] [default to null]
 **bolApiKey** | **String**| Bol API Key | [optional] [default to null]
 **bolApiSecret** | **String**| Bol API Secret | [optional] [default to null]
 **bolRetailerId** | **Integer**| Bol Retailer ID | [optional] [default to null]
 **demandwareClientId** | **String**| Demandware client id | [optional] [default to null]
 **demandwareApiPassword** | **String**| Demandware api password | [optional] [default to null]
 **demandwareUserName** | **String**| Demandware user name | [optional] [default to null]
 **demandwareUserPassword** | **String**| Demandware user password | [optional] [default to null]
 **ebayClientId** | **String**| Application ID (AppID). | [optional] [default to null]
 **ebayClientSecret** | **String**| Shared Secret from eBay application | [optional] [default to null]
 **ebayRuname** | **String**| The RuName value that eBay assigns to your application. | [optional] [default to null]
 **ebayAccessToken** | **String**| Used to authenticate API requests. | [optional] [default to null]
 **ebayRefreshToken** | **String**| Used to renew the access token. | [optional] [default to null]
 **ebayEnvironment** | **String**| eBay environment | [optional] [default to null]
 **ebaySiteId** | **Integer**| eBay global ID | [optional] [default to 0]
 **ecwidAcessToken** | **String**| Access token authorizing the app to access resources on behalf of a user | [optional] [default to null]
 **ecwidStoreId** | **String**| Store Id | [optional] [default to null]
 **lazadaAppId** | **String**| Lazada App ID | [optional] [default to null]
 **lazadaAppSecret** | **String**| Lazada App Secret | [optional] [default to null]
 **lazadaRefreshToken** | **String**| Lazada Refresh Token | [optional] [default to null]
 **lazadaRegion** | **String**| Lazada API endpoint Region | [optional] [default to null]
 **etsyKeystring** | **String**| Etsy keystring | [optional] [default to null]
 **etsySharedSecret** | **String**| Etsy shared secret | [optional] [default to null]
 **etsyAccessToken** | **String**| Access token authorizing the app to access resources on behalf of a user | [optional] [default to null]
 **etsyTokenSecret** | **String**| Secret token authorizing the app to access resources on behalf of a user | [optional] [default to null]
 **etsyClientId** | **String**| Etsy Client Id | [optional] [default to null]
 **etsyRefreshToken** | **String**| Etsy Refresh token | [optional] [default to null]
 **facebookAppId** | **String**| Facebook App ID | [optional] [default to null]
 **facebookAppSecret** | **String**| Facebook App Secret | [optional] [default to null]
 **facebookAccessToken** | **String**| Facebook Access Token | [optional] [default to null]
 **facebookBusinessId** | **String**| Facebook Business ID | [optional] [default to null]
 **netoApiKey** | **String**| Neto API Key | [optional] [default to null]
 **netoApiUsername** | **String**| Neto User Name | [optional] [default to null]
 **shoplineAccessToken** | **String**| Shopline APP Key | [optional] [default to null]
 **shoplineAppKey** | **String**| Shopline APP Key | [optional] [default to null]
 **shoplineAppSecret** | **String**| Shopline App Secret | [optional] [default to null]
 **shoplineSharedSecret** | **String**| Shopline Shared Secret | [optional] [default to null]
 **shopifyAccessToken** | **String**| Access token authorizing the app to access resources on behalf of a user | [optional] [default to null]
 **shopifyApiKey** | **String**| Shopify API Key | [optional] [default to null]
 **shopifyApiPassword** | **String**| Shopify API Password | [optional] [default to null]
 **shopifySharedSecret** | **String**| Shared secret | [optional] [default to null]
 **shoplazzaAccessToken** | **String**| Access token authorizing the app to access resources on behalf of a user | [optional] [default to null]
 **shoplazzaSharedSecret** | **String**| Shared secret | [optional] [default to null]
 **mivaAccessToken** | **String**| Miva access token | [optional] [default to null]
 **mivaSignature** | **String**| Miva signature | [optional] [default to null]
 **shopwareAccessKey** | **String**| Shopware access key | [optional] [default to null]
 **shopwareApiKey** | **String**| Shopware api key | [optional] [default to null]
 **shopwareApiSecret** | **String**| Shopware client secret access key | [optional] [default to null]
 **volusionLogin** | **String**| It&#39;s a Volusion account for which API is enabled | [optional] [default to null]
 **volusionPassword** | **String**| Volusion API Password | [optional] [default to null]
 **walmartClientId** | **String**| Walmart client ID. For the region &#39;ca&#39; use Consumer ID | [optional] [default to null]
 **walmartClientSecret** | **String**| Walmart client secret. For the region &#39;ca&#39; use Private Key | [optional] [default to null]
 **walmartEnvironment** | **String**| Walmart environment | [optional] [default to production]
 **walmartChannelType** | **String**| Walmart WM_CONSUMER.CHANNEL.TYPE header | [optional] [default to null]
 **walmartRegion** | **String**| Walmart region | [optional] [default to us]
 **squareClientId** | **String**| Square (Weebly) Client ID | [optional] [default to null]
 **squareClientSecret** | **String**| Square (Weebly) Client Secret | [optional] [default to null]
 **squareRefreshToken** | **String**| Square (Weebly) Refresh Token | [optional] [default to null]
 **squarespaceApiKey** | **String**| Squarespace API Key | [optional] [default to null]
 **squarespaceClientId** | **String**| Squarespace Connector Client ID | [optional] [default to null]
 **squarespaceClientSecret** | **String**| Squarespace Connector Client Secret | [optional] [default to null]
 **squarespaceAccessToken** | **String**| Squarespace access token | [optional] [default to null]
 **squarespaceRefreshToken** | **String**| Squarespace refresh token | [optional] [default to null]
 **hybrisClientId** | **String**| Omni Commerce Connector Client ID | [optional] [default to null]
 **hybrisClientSecret** | **String**| Omni Commerce Connector Client Secret | [optional] [default to null]
 **hybrisUsername** | **String**| User Name | [optional] [default to null]
 **hybrisPassword** | **String**| User password | [optional] [default to null]
 **hybrisWebsites** | [**List&lt;String&gt;**](String.md)| Websites to stores mapping data | [optional] [default to null]
 **lightspeedApiKey** | **String**| LightSpeed api key | [optional] [default to null]
 **lightspeedApiSecret** | **String**| LightSpeed api secret | [optional] [default to null]
 **commercehqApiKey** | **String**| CommerceHQ api key | [optional] [default to null]
 **commercehqApiPassword** | **String**| CommerceHQ api password | [optional] [default to null]
 **wcConsumerKey** | **String**| Woocommerce consumer key | [optional] [default to null]
 **wcConsumerSecret** | **String**| Woocommerce consumer secret | [optional] [default to null]
 **magentoConsumerKey** | **String**| Magento Consumer Key | [optional] [default to null]
 **magentoConsumerSecret** | **String**| Magento Consumer Secret | [optional] [default to null]
 **magentoAccessToken** | **String**| Magento Access Token | [optional] [default to null]
 **magentoTokenSecret** | **String**| Magento Token Secret | [optional] [default to null]
 **prestashopWebserviceKey** | **String**| Prestashop webservice key | [optional] [default to null]
 **wixAppId** | **String**| Wix App ID | [optional] [default to null]
 **wixAppSecretKey** | **String**| Wix App Secret Key | [optional] [default to null]
 **wixInstanceId** | **String**| Wix Instance ID | [optional] [default to null]
 **wixRefreshToken** | **String**| Wix refresh token | [optional] [default to null]
 **mercadoLibreAppId** | **String**| Mercado Libre App ID | [optional] [default to null]
 **mercadoLibreAppSecretKey** | **String**| Mercado Libre App Secret Key | [optional] [default to null]
 **mercadoLibreRefreshToken** | **String**| Mercado Libre Refresh Token | [optional] [default to null]
 **zidClientId** | **Integer**| Zid Client ID | [optional] [default to null]
 **zidClientSecret** | **String**| Zid Client Secret | [optional] [default to null]
 **zidAccessToken** | **String**| Zid Access Token | [optional] [default to null]
 **zidAuthorization** | **String**| Zid Authorization | [optional] [default to null]
 **zidRefreshToken** | **String**| Zid refresh token | [optional] [default to null]
 **flipkartClientId** | **String**| Flipkart Client ID | [optional] [default to null]
 **flipkartClientSecret** | **String**| Flipkart Client Secret | [optional] [default to null]
 **allegroClientId** | **String**| Allegro Client ID | [optional] [default to null]
 **allegroClientSecret** | **String**| Allegro Client Secret | [optional] [default to null]
 **allegroAccessToken** | **String**| Allegro Access Token | [optional] [default to null]
 **allegroRefreshToken** | **String**| Allegro Refresh Token | [optional] [default to null]
 **allegroEnvironment** | **String**| Allegro Environment | [optional] [default to production]
 **zohoClientId** | **String**| Zoho Client ID | [optional] [default to null]
 **zohoClientSecret** | **String**| Zoho Client Secret | [optional] [default to null]
 **zohoRefreshToken** | **String**| Zoho Refresh Token | [optional] [default to null]
 **zohoRegion** | **String**| Zoho API endpoint Region | [optional] [default to null]
 **tiendanubeUserId** | **Integer**| Tiendanube User ID | [optional] [default to null]
 **tiendanubeAccessToken** | **String**| Tiendanube Access Token | [optional] [default to null]
 **tiendanubeClientSecret** | **String**| Tiendanube Client Secret | [optional] [default to null]
 **ottoClientId** | **String**| Otto Client ID | [optional] [default to null]
 **ottoClientSecret** | **String**| Otto Client Secret | [optional] [default to null]
 **ottoAppId** | **String**| Otto App ID | [optional] [default to null]
 **ottoRefreshToken** | **String**| Otto Refresh Token | [optional] [default to null]
 **ottoEnvironment** | **String**| Otto Environment | [optional] [default to null]
 **ottoAccessToken** | **String**| Otto Access Token | [optional] [default to null]
 **tiktokshopAppKey** | **String**| TikTok Shop App Key | [optional] [default to null]
 **tiktokshopAppSecret** | **String**| TikTok Shop App Secret | [optional] [default to null]
 **tiktokshopRefreshToken** | **String**| TikTok Shop Refresh Token | [optional] [default to null]
 **tiktokshopAccessToken** | **String**| TikTok Shop Access Token | [optional] [default to null]
 **sallaClientId** | **String**| Salla Client ID | [optional] [default to null]
 **sallaClientSecret** | **String**| Salla Client Secret | [optional] [default to null]
 **sallaRefreshToken** | **String**| Salla Refresh Token | [optional] [default to null]
 **sallaAccessToken** | **String**| Salla Access Token | [optional] [default to null]

### Return type

[**AccountConfigUpdate200Response**](AccountConfigUpdate200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## accountFailedWebhooks

> AccountFailedWebhooks200Response accountFailedWebhooks(start, count, ids)

account.failed_webhooks

If the callback of your service for some reason could not accept webhooks from API2Cart, then with the help of this method you can get a list of missed webhooks to perform synchronization again using entity_id. Please note that we keep such records for 24 hours.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AccountApi;

AccountApi apiInstance = new AccountApi();
Integer start = 0; // Integer | This parameter sets the number from which you want to get entities
Integer count = 20; // Integer | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
String ids = 3,14,25; // String | List of сomma-separated webhook ids
try {
    AccountFailedWebhooks200Response result = apiInstance.accountFailedWebhooks(start, count, ids);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#accountFailedWebhooks");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **Integer**| This parameter sets the number from which you want to get entities | [optional] [default to 0]
 **count** | **Integer**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional] [default to 10]
 **ids** | **String**| List of сomma-separated webhook ids | [optional] [default to null]

### Return type

[**AccountFailedWebhooks200Response**](AccountFailedWebhooks200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## accountSupportedPlatforms

> AccountSupportedPlatforms200Response accountSupportedPlatforms()

account.supported_platforms

Use this method to retrieve a list of supported platforms and the sets of parameters required for connecting to each of them. Note: some platforms may have multiple connection methods so that the response will contain multiple sets of parameters.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AccountApi;

AccountApi apiInstance = new AccountApi();
try {
    AccountSupportedPlatforms200Response result = apiInstance.accountSupportedPlatforms();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#accountSupportedPlatforms");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**AccountSupportedPlatforms200Response**](AccountSupportedPlatforms200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

