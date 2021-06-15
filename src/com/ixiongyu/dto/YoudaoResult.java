package com.ixiongyu.dto;

import java.io.Serializable;
import java.util.List;


public class YoudaoResult implements Serializable {

    /**
     * tSpeakUrl : https://openapi.youdao.com/ttsapi?q=HELLO+WORLD&langType=en&sign=74F676187862EE745A488006723B8197&salt=1623771642025&voice=4&format=mp3&appKey=0d5f75b41043a806&ttsVoiceStrict=false
     * web : [{"value":["hello world"],"key":"你好世界"},{"value":["hello world press and key"],"key":"你好世界新闻和密钥"},{"value":["hello world press and key"],"key":"你好世界新闻和关键"}]
     * requestId : 348d1efd-b742-4f3e-8a42-b0178ad66a05
     * query : 你好世界
     * translation : ["HELLO WORLD"]
     * errorCode : 0
     * dict : {"url":"yddict://m.youdao.com/dict?le=eng&q=%E4%BD%A0%E5%A5%BD%E4%B8%96%E7%95%8C"}
     * webdict : {"url":"http://mobile.youdao.com/dict?le=eng&q=%E4%BD%A0%E5%A5%BD%E4%B8%96%E7%95%8C"}
     * l : zh-CHS2en
     * isWord : false
     * speakUrl : https://openapi.youdao.com/ttsapi?q=%E4%BD%A0%E5%A5%BD%E4%B8%96%E7%95%8C&langType=zh-CHS&sign=A2CE5ECB12001BFEF91A9CE7CDB7A3B1&salt=1623771642025&voice=4&format=mp3&appKey=0d5f75b41043a806&ttsVoiceStrict=false
     */

    private String tSpeakUrl;
    private String requestId;
    private String query;
    private String errorCode;
    private DictBean dict;
    private WebdictBean webdict;
    private String l;
    private boolean isWord;
    private String speakUrl;
    private List<WebBean> web;
    private List<String> translation;

    public String gettSpeakUrl() {
        return tSpeakUrl;
    }

    public void settSpeakUrl(String tSpeakUrl) {
        this.tSpeakUrl = tSpeakUrl;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public DictBean getDict() {
        return dict;
    }

    public void setDict(DictBean dict) {
        this.dict = dict;
    }

    public WebdictBean getWebdict() {
        return webdict;
    }

    public void setWebdict(WebdictBean webdict) {
        this.webdict = webdict;
    }

    public String getL() {
        return l;
    }

    public void setL(String l) {
        this.l = l;
    }

    public boolean isWord() {
        return isWord;
    }

    public void setWord(boolean word) {
        isWord = word;
    }

    public String getSpeakUrl() {
        return speakUrl;
    }

    public void setSpeakUrl(String speakUrl) {
        this.speakUrl = speakUrl;
    }

    public List<WebBean> getWeb() {
        return web;
    }

    public void setWeb(List<WebBean> web) {
        this.web = web;
    }

    public List<String> getTranslation() {
        return translation;
    }

    public void setTranslation(List<String> translation) {
        this.translation = translation;
    }

    @Override
    public String toString() {
        return "YoudaoResult{" +
                "tSpeakUrl='" + tSpeakUrl + '\'' +
                ", requestId='" + requestId + '\'' +
                ", query='" + query + '\'' +
                ", errorCode='" + errorCode + '\'' +
                ", dict=" + dict +
                ", webdict=" + webdict +
                ", l='" + l + '\'' +
                ", isWord=" + isWord +
                ", speakUrl='" + speakUrl + '\'' +
                ", web=" + web +
                ", translation=" + translation +
                '}';
    }

    public static class DictBean implements Serializable {
        /**
         * url : yddict://m.youdao.com/dict?le=eng&q=%E4%BD%A0%E5%A5%BD%E4%B8%96%E7%95%8C
         */

        private String url;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        @Override
        public String toString() {
            return "DictBean{" +
                    "url='" + url + '\'' +
                    '}';
        }
    }

    public static class WebdictBean implements Serializable {
        /**
         * url : http://mobile.youdao.com/dict?le=eng&q=%E4%BD%A0%E5%A5%BD%E4%B8%96%E7%95%8C
         */

        private String url;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        @Override
        public String toString() {
            return "WebdictBean{" +
                    "url='" + url + '\'' +
                    '}';
        }
    }

    public static class WebBean implements Serializable {
        /**
         * value : ["hello world"]
         * key : 你好世界
         */

        private String key;
        private List<String> value;

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public List<String> getValue() {
            return value;
        }

        public void setValue(List<String> value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "WebBean{" +
                    "key='" + key + '\'' +
                    ", value=" + value +
                    '}';
        }
    }
}
