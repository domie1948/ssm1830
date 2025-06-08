const base = {
    get() {
                return {
            url : "http://localhost:8080/ssm394a7/",
            name: "ssm394a7",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm394a7/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "网上书城系统"
        } 
    }
}
export default base
