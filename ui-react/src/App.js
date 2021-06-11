import "./App.css";
import Dashboard from "./layouts/Dashboard";
import Container from '@material-ui/core/Container';
import Register from "./pages/Register";
import Login from "./pages/Login";
import { Route, Switch } from "react-router";
import PublicLayout from "./layouts/PublicLayout";


function App() {
  return (
    <div className="App">
     
      <Switch>
      <Route path="/" component={Dashboard} />
        <Route path="/register" component={Register} />
        <Route path="/login" component={Login} />
        <Route path="/public-layout" component={PublicLayout} />
      </Switch>
    </div>
  );
}

export default App;
