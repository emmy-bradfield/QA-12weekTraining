import Basics from './Basics.jsx';
import Embed from './Embed.jsx';

const Main = () => {
    return (
        <main className="App-main">
            <h2> Props </h2>
            <p>
                Using props with static, immutable properties
            </p>
            <hr></hr>
            <Basics />
            <div className="divider"></div>
            <h2> Embedded Functions and Objects </h2>
            <p>
                Objects or functions can be embeded into JavaScript.
            </p>
            <hr></hr>
            <Embed />
        </main>
    );
}

export default Main;