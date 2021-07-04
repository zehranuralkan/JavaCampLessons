import React, {useState} from 'react'
import CartSummary from './CartSummary'
import SignedOut from './SignedOut'
import Signedin from './Signedin'
import { Container, Menu } from 'semantic-ui-react'
import { useHistory } from 'react-router-dom'


export default function Navi() {
    const [isAuthenticated, setIsAuthenticated] = useState(true)
    const history=useHistory()
    function handleSingOut(props) {
        setIsAuthenticated(false)
        history.push("/")
    }
    function handleSingIn(props) {
        setIsAuthenticated(true)
    }
    return (
        <div>
            <Menu inverted fixed="top">
                <Container>
                    <Menu.Item
                        name='home'

                    />
                    <Menu.Item
                        name='messages'

                    />

                    <Menu.Menu position='right'>
                        <CartSummary></CartSummary>
                        {isAuthenticated?<Signedin signOut={handleSingOut} bisey="1"/>
                        :<SignedOut signIn={handleSingIn}/>}
                      
                    </Menu.Menu>

                </Container>

            </Menu>
            Navi
        </div>
    )
}
