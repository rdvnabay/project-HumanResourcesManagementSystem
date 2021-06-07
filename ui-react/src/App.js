import "./App.css";
import Dashboard from "./layouts/Dashboard";
import {Container} from 'semantic-ui-react'

function App() {
  return (
    <div className="App">
      <Container top="fixed">
      <Dashboard/>
      </Container> 
    </div>
  );
}

export default App;
