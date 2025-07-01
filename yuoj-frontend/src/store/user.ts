// initial state 存储的状态信息
import { StoreOptions } from "vuex";

// mutations（尽量同步） 对变量进行增删改（更新的方法）

// actions （支持异步） 执行异步操作，并且触发mutations的更该

export default {
  namespaced: true,
  state: () => ({
    loginUser: {
      userName: "未登录",
    },
  }),
  actions: {
    // todo 改为远程请求获取登录信息
    getLoginUser({ commit, state }, payload) {
      commit("updateUser", { userName: "Yuqing" });
    },
  },
  mutations: {
    updateUser(state, payload) {
      state.loginUser = payload;
    },
  },
} as StoreOptions<any>;
