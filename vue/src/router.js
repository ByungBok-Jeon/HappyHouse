import Vue from "vue";
import Router from "vue-router";
import CustomersList from "./components/customer/CustomersList.vue";
import SearchCustomers from "./components/customer/SearchCustomers.vue";
import SearchCustomersById from "./components/customer/SearchCustomersById.vue";
import ChartCustomer from "./components/customer/ChartCustomer.vue";
import AddCustomer from "./components/customer/AddCustomer.vue";
import DetailCustomer from "./components/customer/DetailCustomer.vue";
import UpdateCustomer from "./components/customer/UpdateCustomer.vue";
//import Login from "./components/Login.vue";
//import CustomerRegistry from "./components/CustomerRegistry.vue";
import ChartPieCustomer from "./components/customer/ChartPieCustomer.vue";
import QnaBoard from "./components/board/QnaBoard.vue";
import UpdateBoard from "./components/board/UpdateBoard.vue";
import CreateBoard from "./components/board/CreateBoard.vue";
import Home from "./views/Home.vue";
import SearchHouse from "./components/Search/SearchHouse.vue";
import SearchHouseRent from "./components/Search/SearchHouseRent.vue";
import SignUp from "./components/SignUp.vue";
Vue.use(Router);

export default new Router({
  mode: "history",
  routes: [
    {
    path: "/",
    name: "Home",
    component: Home,
  },
  {
    path: "/search",
    name: "Search",
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () =>
      import(/* webpackChunkName: "about" */ "./views/Search.vue"),
  },
    {
      path: "/customersList",
      name: "customersList",
      component: CustomersList
    },
    {
      path: "/searchCustomer",
      name: "searchCustomer",
      component: SearchCustomers
    },
    {
      path: "/searchbyid",
      name: "searchbyid",
      component: SearchCustomersById
    }
    ,
    {
      path: "/chartcustomer",
      name: "chartcustomer",
      component: ChartCustomer
    } ,
    {
      path: "/add",
      name: "add",
      component: AddCustomer
    }
    ,
    {
      path: '/detailcustomer/:id',
      name: 'detailcustomer',
      component: DetailCustomer,
      props: true,
    }
    ,
    {
      path: '/updatecustomer/:id',
      name: 'updatecustomer',
      component: UpdateCustomer,
      props: true,
    }
    ,
    {
      path: '/chartpiecustomer',
      name: 'chartpiecustomer',
      component: ChartPieCustomer
    }
    ,
    {
      path: '/qnaboard',
      name: 'qnaboard',
      component: QnaBoard
    }
    ,
    {
      path: '/updateboard/:num',
      name: 'updateboard',
      component: UpdateBoard,
      props: true,
    }
    ,
    {
      path: '/createboard',
      name: 'createboard',
      component: CreateBoard
    },
    {
      path: '/searchhouse/:dongcode',
      name: 'searchhouse',
      component: SearchHouse,
      props: true,
    },
    {
      path: '/searchhouserent/:dongcode/:sigungucode',
      name: 'searchhouserent',
      component: SearchHouseRent,
      props: true,
    },
    {
      path: '/signup',
      name: 'signup',
      component: SignUp
    },
  ]
});