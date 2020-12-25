package com.wf.ds.model;

import java.util.List;

public class UserBean {
    /**
     * error : false
     * results : [{"_id":"5b63cd4e9d21225e0d3f58c9","createdAt":"2018-08-03T11:34:38.672Z","desc":"2018-08-03","publishedAt":"2018-08-03T00:00:00.0Z","source":"api","type":"福利","url":"https://ww1.sinaimg.cn/large/0065oQSqgy1ftwcw4f4a5j30sg10j1g9.jpg","used":true,"who":"lijinshan"},{"_id":"5b6151509d21225206860f08","createdAt":"2018-08-01T14:21:04.556Z","desc":"2018-08-01","publishedAt":"2018-08-01T00:00:00.0Z","source":"api","type":"福利","url":"https://ww1.sinaimg.cn/large/0065oQSqly1ftu6gl83ewj30k80tites.jpg","used":true,"who":"lijinshan"},{"_id":"5b60356a9d212247776a2e0e","createdAt":"2018-07-31T18:09:46.825Z","desc":"2018-07-31","publishedAt":"2018-07-31T00:00:00.0Z","source":"api","type":"福利","url":"http://ww1.sinaimg.cn/large/0065oQSqgy1ftt7g8ntdyj30j60op7dq.jpg","used":true,"who":"lijinshan"},{"_id":"5b5e93499d21220fc64181a9","createdAt":"2018-07-30T12:25:45.937Z","desc":"2018-07-30","publishedAt":"2018-07-30T00:00:00.0Z","source":"web","type":"福利","url":"https://ww1.sinaimg.cn/large/0065oQSqgy1ftrrvwjqikj30go0rtn2i.jpg","used":true,"who":"lijinshanmx"},{"_id":"5b50107f421aa917a31c0565","createdAt":"2018-07-19T12:15:59.226Z","desc":"2018-07-19","publishedAt":"2018-07-19T00:00:00.0Z","source":"web","type":"福利","url":"https://ww1.sinaimg.cn/large/0065oQSqly1ftf1snjrjuj30se10r1kx.jpg","used":true,"who":"lijinshanmx"},{"_id":"5b4eaae4421aa93aa99bee16","createdAt":"2018-07-18T11:14:55.648Z","desc":"2018-07-18","publishedAt":"2018-07-18T00:00:00.0Z","source":"web","type":"福利","url":"https://ww1.sinaimg.cn/large/0065oQSqly1ftdtot8zd3j30ju0pt137.jpg","used":true,"who":"lijinshanmx"},{"_id":"5b481d01421aa90bba87b9ae","createdAt":"2018-07-13T11:31:13.266Z","desc":"2018-07-13","publishedAt":"2018-07-13T00:00:00.0Z","source":"web","type":"福利","url":"http://ww1.sinaimg.cn/large/0073sXn7ly1ft82s05kpaj30j50pjq9v.jpg","used":true,"who":"lijinshanmx"},{"_id":"5b456f5d421aa92fc4eebe48","createdAt":"2018-07-11T10:45:49.246Z","desc":"2018-07-11","publishedAt":"2018-07-11T00:00:00.0Z","source":"web","type":"福利","url":"https://ww1.sinaimg.cn/large/0065oQSqly1ft5q7ys128j30sg10gnk5.jpg","used":true,"who":"lijinshanmx"},{"_id":"5b441f06421aa92fccb520a2","createdAt":"2018-07-10T10:50:46.379Z","desc":"2018-07-10","publishedAt":"2018-07-10T00:00:00.0Z","source":"web","type":"福利","url":"https://ww1.sinaimg.cn/large/0065oQSqgy1ft4kqrmb9bj30sg10fdzq.jpg","used":true,"who":"lijinshanmx"},{"_id":"5b42d1aa421aa92d1cba2918","createdAt":"2018-07-09T11:08:26.162Z","desc":"2018-07-09","publishedAt":"2018-07-09T00:00:00.0Z","source":"web","type":"福利","url":"http://ww1.sinaimg.cn/large/0065oQSqly1ft3fna1ef9j30s210skgd.jpg","used":true,"who":"lijinshanmx"}]
     */

    private Boolean error;
    private List<ResultsDTO> results;

    public Boolean isError() {
        return error;
    }

    public void setError(Boolean error) {
        this.error = error;
    }

    public List<ResultsDTO> getResults() {
        return results;
    }

    public void setResults(List<ResultsDTO> results) {
        this.results = results;
    }

    public static class ResultsDTO {
        /**
         * _id : 5b63cd4e9d21225e0d3f58c9
         * createdAt : 2018-08-03T11:34:38.672Z
         * desc : 2018-08-03
         * publishedAt : 2018-08-03T00:00:00.0Z
         * source : api
         * type : 福利
         * url : https://ww1.sinaimg.cn/large/0065oQSqgy1ftwcw4f4a5j30sg10j1g9.jpg
         * used : true
         * who : lijinshan
         */

        private String _id;
        private String createdAt;
        private String desc;
        private String publishedAt;
        private String source;
        private String type;
        private String url;
        private Boolean used;
        private String who;

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getPublishedAt() {
            return publishedAt;
        }

        public void setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public Boolean isUsed() {
            return used;
        }

        public void setUsed(Boolean used) {
            this.used = used;
        }

        public String getWho() {
            return who;
        }

        public void setWho(String who) {
            this.who = who;
        }
    }
}
