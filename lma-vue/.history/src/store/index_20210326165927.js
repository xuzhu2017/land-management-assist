import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    username:
      window.sessionStorage.getItem('username') == null
        ? ''
        : JSON.parse(window.sessionStorage.getItem('username' || '[]')),
    adminMenus: []
  },
  mutations: {
    initAdminMenu(state, menus) {
      state.adminMenus = menus
    },
    login(state, data) {
      state.username = data
      // window.sessionStorage.setItem('username', JSON.stringify(data))
      window.sessionStorage.setItem('username', JSON.stringify(data))
    },
    logout(state) {
      // 注意不能用 null 清除，否则将无法判断 user 里具体的内容
      state.username = ''
      window.sessionStorage.removeItem('username')
      state.adminMenus = []
    }
  },
  actions: {}
})
