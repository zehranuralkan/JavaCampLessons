import React from 'react'
import { Menu ,Image,Dropdown} from 'semantic-ui-react'
export default function Signedin({signOut}) {
    return (
        <div>
            <Menu.Item>
<Image avatar spaced="top right" src="https://ihale.ankara.edu.tr/Addons/assets/layouts/layout4/img/avatar9.jpg">
<Dropdown pointing="top left" text="zehra">
<Dropdown.Menu>
<Dropdown.Item text="bilgilerim" icon="info"></Dropdown.Item>
<Dropdown.Item onClick={signOut} text="Çıkış yap" icon="sign-out">
</Dropdown.Item>

</Dropdown.Menu>

</Dropdown>

</Image>

            </Menu.Item>
        </div>
    )
}
